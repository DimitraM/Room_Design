package com.mycompany.roomdesign;
import com.mycompany.roomdesign.Enums.RoomType;
import java.util.ArrayList;

/**
 *package 
 * @author Chrysoula
 */
public class Room {
    private RoomType type;
    private ArrayList <Wall> walls; //list of walls that exist in a room
    
   
   //Constructor for room: 
   public Room(){
   
       walls = new ArrayList<>();   //every room has a list of walls
   
   }
   
   //method that adds walls to the list of walls:
   public void addWall(Wall wall){
    
        walls.add(wall);
        
    }
   
   //room type GETTER
    public RoomType getType(){
        
        return  type;
    
    }
    
    //Walls list GETTER
    public ArrayList<Wall> getWalls(){
    
        return walls;
        
    }
    
    /*public void showWalls(ArrayList list){
        
        
        
    }*/
   
}
