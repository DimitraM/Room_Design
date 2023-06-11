<<<<<<< HEAD

import code.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        RoomType.roomTypeInitialization();
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
    }
=======
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
}
>>>>>>> 0b57729f (change file position)
