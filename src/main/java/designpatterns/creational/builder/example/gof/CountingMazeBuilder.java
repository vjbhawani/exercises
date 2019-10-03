package designpatterns.creational.builder.example.gof;

public class CountingMazeBuilder implements MazeBuilder {
    private int componentsCount = 0;

    @Override
    public void buildMaze() {

    }

    @Override
    public void buildRoom(int room) {
        componentsCount+=1;
    }

    @Override
    public void buildDoor(int roomFrom, int roomTo) {
        componentsCount+=2;
    }

    public int getResult() {
        return componentsCount;
    }


}
