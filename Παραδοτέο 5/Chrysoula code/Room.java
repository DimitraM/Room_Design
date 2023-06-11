import com.mycompany.roomdesign.Enums.RoomType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.lang.*;

/**
 *package 
 * @author Chrysoula
 */
public class Room {
    private RoomType type;
    private ArrayList <Wall> walls = new ArrayList<>(); //list of walls that exist in a room
    private float height = 0;
    private float width = 0;
    private float length = 0; //the center of the room is the point 0,0,0 of the coordinate system
    
   Wall wall;
   //Constructors: 

    public Room(float height,float width,float length) {
        this.width=width;
        this.length=length;
        this.height=height;
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

    //dimensions getter and setter
    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    
    
    public void chooseWall(ArrayList list, Room room){
        
         System.out.println("Available walls to edit:\n" +list );
         
         System.out.println("Choose a wall to edit:\n" );
         
         Scanner myscanner = new Scanner(System.in);     
         int response = myscanner.nextInt();            //the user has to type the number of the wall he wants to choose
         
         //representation of the user's choice:
         
         for (int i=0; i<list.size(); i++){
             if(response==i+1){
                 System.out.println("You chose wall:" + (i+1) + "\n" );
                 Wall x = new Wall();
                 x = (Wall) list.get(i);
                 System.out.println("Wall selected with length: " + x.getLength() + " meters");
                 x.chooseWallpiece(x, room);
             }
         }
         
         
         
         
    }
   
}
