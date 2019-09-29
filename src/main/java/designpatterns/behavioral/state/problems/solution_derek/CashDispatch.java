package designpatterns.behavioral.state.problems.solution_derek;

public class CashDispatch implements AtmState {
    @Override
    public void cardInserted(AtmMachine atmMachine) {
        System.out.println("[cardInserted] card already inserted");
    }

    @Override
    public void pinEntered(AtmMachine atmMachine, int pin) {
        System.out.println("[pinEntered] pin already entered");
    }

    @Override
    public void cashDispatch(AtmMachine atmMachine, int cache) {
        System.out.println("[cashDispatch] cash dispatched : " + cache);
    }

    @Override
    public void cardRemoved(AtmMachine atmMachine) {
        System.out.println("[cardRemoved] card removed");
        atmMachine.setState(new CardRemoved());
    }
}
