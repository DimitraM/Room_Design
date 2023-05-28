package code.house.room;

import code.RoomType;
import code.house.House;

import java.util.ArrayList;

public class Room {
    private ArrayList<RoomType> type;
    private String name;

    public Room(House house,ArrayList<RoomType> type) {
        this.type = type;
    }

    public ArrayList<RoomType> getRoomType(){return  type;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
