package code.house.room;
import code.house.room.objects.*;

import code.RoomType;
import code.house.House;

import code.house.room.objects.Wall;
import code.house.room.objects.Furniture;
import code.house.room.objects.Corner;
import code.house.room.objects.
import java.util.ArrayList;

public class Room {
    private House house;

    private ArrayList<RoomType> type;
    private String name;
    private ArrayList<Furniture> furnitures;
    private ArrayList<Corner> corners;
    private ArrayList<Opening> openings;
    private ArrayList<Wall> walls;
    private RoomPlan roomPlan;
    public Room(House house, ArrayList<RoomType> type) {
        this.house = house;
        this.type = type;
        this.furnitures = new ArrayList<Furniture>();
        this.roomPlan=new RoomPlan(this);
    }

    public ArrayList<Corner> takeLackingCorners(){

        ArrayList<Corner> lackingCorners=new ArrayList<Corner>();
         for (Corner existingCorner:corners){
             if (existingCorner.isNotFull()==false){

                 lackingCorners.add(existingCorner);
             }


         }
         return lackingCorners;

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
    public void addWall(Wall wall){
        this.walls.add(wall);
    }
    public ArrayList<Corner> getCorners(){

        return this.corners;
    }

    public void addCorner(Corner corner){
        this.corners.add(corner);
    }

    public RoomPlan getRoomPlan() {
        return roomPlan;
    }
}