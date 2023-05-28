package code.house.room;

import code.RoomType;
import code.house.House;

import java.util.ArrayList;

public class Room {
    private ArrayList<RoomType> type;
    private String name;

    public Room(House house, ArrayList<RoomType> type) {


        this.house - house;
        this.type = type;
        items = new ArrayList<Furniture>();
        doors = new ArrayList<Openings>();
    }

    public ArrayList<RoomType> getRoomType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addItems(Furniture furniture) {
        items.add(furniture);
    }

    public void addOpenings(Openings opening) {
        doors.add(opening);
    }

    public void sortOptions(RoomType type) {
        //this method sorts options in list for user to add
        if (doors == null) {
            //show only openings firsts
        }


    }
    public ArrayList<Wall> getWalls(){

        return walls;

    }
}