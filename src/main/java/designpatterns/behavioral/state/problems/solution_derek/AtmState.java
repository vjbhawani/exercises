package designpatterns.behavioral.state.problems.solution_derek;

import designpatterns.behavioral.state.pattern.State;

public interface AtmState extends State {
    void cardInserted(AtmMachine atmMachine);
    void pinEntered(AtmMachine atmMachine, int pin);
    void cashDispatch(AtmMachine atmMachine, int cache);
    void cardRemoved(AtmMachine atmMachine);
}
