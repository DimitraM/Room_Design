package house.room;
import java.util.ArrayList;

import Enums.RoomType;
import house.room.objects.Furniture;
import house.room.objects.Openings;
import house.room.objects.Wall;

public class Room {
    private RoomType type;
    private ArrayList<Furniture> items; 
    private ArrayList<Openings> doors;
    private ArrayList <Wall> walls; //list of walls that exist in a room
    
    //constructors
    public Room(RoomType type) {
        this.type=type;
    }

    public Room()
    {
    	walls = new ArrayList<>();   //every room has a list of walls
        items = new ArrayList<Furniture>();
        doors = new ArrayList<Openings>(); 
    }

    public void addItems(Furniture furniture)
    {
        items.add(furniture);
    }

    public void addOpenings(Openings opening)
    {
        doors.add(opening);
    }

    //method that adds walls to the list of walls:
    public void addWall(Wall wall){
        walls.add(wall);
    }

    public RoomType getType(){return  type;} //getter
    

    public void sortOptions(RoomType type){
        //this method sorts options in list for user to add
        if(doors==null){
           //show only openings firsts 
        }
    }
    
    //Walls list GETTER
    public ArrayList<Wall> getWalls(){
    
        return walls;
        
    }
    
    /*public void showWalls(ArrayList list){
        
        
        
    }*/
        
}

