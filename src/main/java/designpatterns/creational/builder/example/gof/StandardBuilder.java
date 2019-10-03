package designpatterns.creational.builder.example.gof;

public class StandardBuilder implements MazeBuilder {
    private Maze maze;

    @Override
    public void buildMaze() {
        this.maze = new Maze();
        System.out.println("Standard Maze Build");
    }

    @Override
    public void buildRoom(int room) {
        maze.addRoom(new Room(room));
    }

    @Override
    public void buildDoor(int roomFrom, int roomTo) {
        for (Room room : maze.getRooms()) {
            if (room.getRoomNo() == roomFrom) {
                room.setNeighbourRoom(roomTo);
            }
            if (room.getRoomNo() == roomTo) {
                room.setNeighbourRoom(roomFrom);
            }
        }
    }

    public Maze result() {
        return maze;
    }
}
