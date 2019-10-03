package designpatterns.creational.builder.example.gof;

public class Room {
    private final int roomNo;
    private int neigborRoom;

    public Room(int i) {
        this.roomNo = i;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setNeighbourRoom(int roomTo) {
        this.neigborRoom = roomTo;
    }
}
