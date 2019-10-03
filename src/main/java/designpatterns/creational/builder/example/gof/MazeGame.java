package designpatterns.creational.builder.example.gof;

/**
 * Director
 */
public class MazeGame {
    void buildMaze(MazeBuilder builder) {
        builder.buildMaze();
        builder.buildRoom(1);
        builder.buildRoom(2);
        builder.buildDoor(1,2);
    }

    void buildComplexMaze(MazeBuilder builder) {
        builder.buildMaze();
        builder.buildRoom(1);
        builder.buildRoom(101);
        builder.buildDoor(1,101);
    }


}
