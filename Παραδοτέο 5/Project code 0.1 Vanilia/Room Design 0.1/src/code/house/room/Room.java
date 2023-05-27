package code.house.room;

import code.RoomType;

import java.util.ArrayList;

public class Room {
    private ArrayList<RoomType> type;

    public Room(ArrayList<RoomType> type) {
        this.type = type;
    }

    public RoomType getRoomType(){return  type;}
}
