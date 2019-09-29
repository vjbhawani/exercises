package designpatterns.behavioral.state.problems.solution_derek;

public class PinEntered implements AtmState {
    @Override
    public void cardInserted(AtmMachine atmMachine) {
        System.out.println("[cardInserted] already inserted");
    }

    @Override
    public void pinEntered(AtmMachine atmMachine, int pin) {
        System.out.println("[pinEntered] pin already entered");
    }

    @Override
    public void cashDispatch(AtmMachine atmMachine, int cache) {
        System.out.println("[cashDispatch] " +cache + "cash dispatched");
        atmMachine.setState(new CashDispatch());
    }

    @Override
    public void cardRemoved(AtmMachine atmMachine) {
        System.out.println("[cardRemoved] card removed");
        atmMachine.setState(new CardRemoved());
    }
}
