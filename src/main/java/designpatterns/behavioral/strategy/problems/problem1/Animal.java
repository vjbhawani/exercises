package designpatterns.behavioral.strategy.problems.problem1;

import designpatterns.behavioral.strategy.structure.Context;

public class Animal implements Context {
    /*
    problem source: https://www.youtube.com/watch?v=-NCgRD9-C6o&t=29s

    Now let say we want to add a behaviour fly, to Animal. How can we solve this ?
    other constraints:
    this behaviour has few variants (fly and can't fly), means few subclasses of animal will have behavior1 (fly), few will have behavior2 (can't fly), and so on...
    the behaviour can be changed at run time, means if a bird is injured how it may no longer fly
     */
}
