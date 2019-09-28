package designpatterns.behavioral.strategy.problems.problem1.solution_statergy;

import designpatterns.behavioral.strategy.pattern.Context;

public class Animal implements Context {
    private final Fly fly;
    /*
    Now let say we want to add a behaviour fly, to Animal. How can we solve this ?
    other constraints:
    this behaviour has few variants (fly and can't fly), means few subclasses of animal will have behavior1 (fly), few will have behavior2 (can't fly), and so on...
    the behaviour can be changed at run time, means if a bird is injured how it may no longer fly
     */


    /*
    so this solution no longer has limitations of solution1. i.e:
    1. no subclasses of Animal has to implement the fly method, so no redundant/duplicate code.
    2. the behaviour fly can change at run time.
     */
    public Animal(Fly fly) {
        this.fly = fly;
    }
}
