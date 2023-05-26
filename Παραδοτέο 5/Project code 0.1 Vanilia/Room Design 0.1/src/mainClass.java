import java.util.ArrayList;
import java.util.Scanner;
import house.room.Room;
import house.room.objects.Wall;


/**
 *
 * @author Chrysoula
 */
public class mainClass {
    public static void main (String[] args)
    {
       Room bedroom=new Room();
       //creating new wall objects for testing
       
       Wall testwall_1 = new Wall("white", "wood", "mermaidWP");
       Wall testwall_2 = new Wall("white", "wood", "wavesWP");
       Wall testwall_3 = new Wall("blue", "wood", "none");
       Wall testwall_4 = new Wall("blue", "wood", "none");

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
        if (response == "1"){
            ArrayList availablewalls = room.getWalls();            //call getWalls() method to find the walls in the specific room
            //room.showWalls(availablewalls);                        //call showWalls()
            
            System.out.println("Available walls to edit:\n" );
            
            for(int i=0; i<availablewalls.size(); i++) {
            System.out.println( (i+1) + " Wall: " + availablewalls.get(i));
            
            }
        }
    }
}