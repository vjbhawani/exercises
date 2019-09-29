package designpatterns.behavioral.state.problems.solution_derek;

public class CardInserted implements AtmState {
    @Override
    public void cardInserted(AtmMachine atmMachine) {
        System.out.println("[cardInserted] card is already inserted");
    }

    @Override
    public void pinEntered(AtmMachine atmMachine, int pin) {
        System.out.println("[pinEntered] pin entered : " + pin);
        atmMachine.setState(new PinEntered());
    }

    @Override
    public void cashDispatch(AtmMachine atmMachine, int cache) {
        System.out.println("[cashDispatch] enter pin first");
    }

    @Override
    public void cardRemoved(AtmMachine atmMachine) {
        System.out.println("[cardRemoved] card removed");
        atmMachine.setState(new CardRemoved());
    }
}
