package designpatterns.behavioral.strategy.problems.problem1.solution1;

import designpatterns.behavioral.strategy.pattern.Context;

public class Animal implements Context {
    /*
    we can have a fly method, which is Overridden by all Animal subclasses.

    Problem with this solution:
        Since fly method can only have two behaviours (fly, can't fly),
        subclasses will have redundant code, on top of that what if the
        behaviour changes at run time.
     */

    void fly() {

    }
}
