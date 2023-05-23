package Enums;

public enum RoomType {
    bedroom(0),kitchen(0),toilet(0),livingroom(1),hall(1),
    corridor(1),balcony(1),studio(2),garden(2);

    private final int priority;

    RoomType(int priority){
        this.priority=priority;
    }

    public int getPriority(){return priority;}

}
