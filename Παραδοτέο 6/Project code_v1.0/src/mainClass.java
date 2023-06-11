import java.util.ArrayList;
import java.util.Scanner;


public class mainClass {
    public static void main (String[] args)
    {

       RoomType.roomTypeInitialization();
       Room bedroom=new Room(2,3,4);
       //creating new wall objects for testing
       
       Wall testwall_1 = new Wall("white", "wood", "mermaidWP", 2,2,2 );
       Wall testwall_2 = new Wall("white", "wood", "wavesWP",2,2,2);
       Wall testwall_3 = new Wall("blue", "wood", "none",2,2,2);
       Wall testwall_4 = new Wall("blue", "wood", "none",2,2,2);

        //System.out.println("wall 1 "+ testwall_1.toString());
       //adding them to the list of the bedroom's walls
       bedroom.addWall(testwall_1);
       bedroom.addWall(testwall_2);
       bedroom.addWall(testwall_3);
       bedroom.addWall(testwall_4);
       
       wallEditing(bedroom); //calling wall editing method
    }
    
    //Representing the wall editing button
    public static void wallEditing(Room room){
        
        System.out.println("EditWallButton"); // this represents the button
        Scanner myscanner = new Scanner(System.in); //creating scanner to get user's reaction to the button
        
        String response = myscanner.nextLine(); //the user responds 1(it represents pressing the button). if he types anything else, we ignore it because logically, you can only press a button or not
        
        //handling user response:
        if ("1".equals(response)){
            ArrayList<Wall> availablewalls = room.getWalls();            //call getWalls() method to find the walls in the specific room
            room.chooseWall(availablewalls,room);                        //call chooseWall() where the user will have to choose a wall from the list
            
           
        }
    }
}