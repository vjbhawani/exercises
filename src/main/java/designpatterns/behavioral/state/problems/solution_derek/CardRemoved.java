package designpatterns.behavioral.state.problems.solution_derek;

public class CardRemoved implements AtmState {
    @Override
    public void cardInserted(AtmMachine atmMachine) {
        System.out.println("[cardInserted] card inserted");
        atmMachine.setState(new CardInserted());
    }

    @Override
    public void pinEntered(AtmMachine atmMachine, int pin) {
        System.out.println("[pinEntered] insert card first");
    }

    @Override
    public void cashDispatch(AtmMachine atmMachine, int cache) {
        System.out.println("[cashDispatch] insert card first");
    }

    @Override
    public void cardRemoved(AtmMachine atmMachine) {
        System.out.println("[cardRemoved] there is no card to remove");
    }
}
