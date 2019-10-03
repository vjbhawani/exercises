package designpatterns.creational.builder.example.gof;

import designpatterns.creational.builder.pattern.Builder;

public interface MazeBuilder extends Builder {
    void buildMaze();
    void buildRoom(int room);
    void buildDoor(int roomFrom, int roomTo);
}
