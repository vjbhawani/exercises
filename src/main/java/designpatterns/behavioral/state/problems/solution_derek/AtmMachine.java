package designpatterns.behavioral.state.problems.solution_derek;

import designpatterns.behavioral.state.pattern.Context;

/**
 *  here AtmMachine behaviour depends on AtmState, and it's behaviour is changing at run time depending on the current AtmState.
 */
public class AtmMachine extends Context {
    private AtmState state = new CardRemoved();

    public void setState(AtmState state) {
        this.state = state;
    }

    private void insertCard() {
        this.state.cardInserted(this);
    }
    private void enterPin(int pin) {
        this.state.pinEntered(this, pin);
    }
    private void getCash(int cash) {
        this.state.cashDispatch(this, cash);
    }
    private void removeCard() {
        this.state.cardRemoved(this);
    }

    public static void main(String[] args) {
        AtmMachine atmMachine = new AtmMachine();

        atmMachine.getCash(100);
        atmMachine.enterPin(987);
        atmMachine.removeCard();

        atmMachine.insertCard();
        atmMachine.enterPin(987);
        atmMachine.getCash(100);
        atmMachine.getCash(200);
        atmMachine.removeCard();
        atmMachine.getCash(200);
    }
}
