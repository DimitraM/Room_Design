package code.house.room;

import code.house.room.objects.Corner;
import code.house.room.objects.Wall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RoomPlan {
    private Room room;

    public RoomPlan(Room room){

        this.room=room;
    }

    public Wall chooseWall(){

    }
    public void showcaseDrawingPoints(ArrayList<Corner> lackingCorners){
        Float[] positionChoosed;
        Scanner myscanner = new Scanner(System.in);
        float positionChoosed[]=new float[3];
        Boolean NoLegitCorner=true;
        for (int i=0;myscanner.hasNext();i++) {
            positionChoosed[i]= myscanner.nextFloat();
        }

        if (!lackingCorners.isEmpty()) {
            for (Corner potentialCorner : lackingCorners) {

                System.out.println("Point that can be choosen to start the wall:" + Arrays.toString(potentialCorner.getPosition()));
            }
            while (NoLegitCorner) {
                positionChoosed = new float[3];

                for (int i = 0; myscanner.hasNext(); i++) {
                    positionChoosed[i] = myscanner.nextFloat();
                }
                for (Corner existingCorner : lackingCorners){
                    if (Arrays.equals(existingCorner.getPosition(),positionChoosed)){
                        NoLegitCorner=false;
                        startingPositionChoice(existingCorner);
                    }
                }
            }
        }
        else {
                System.out.println("Choose everywhere to start drawing a wall");
                for (int i = 0; myscanner.hasNext() && i<positionChoosed.length; i++) {
                    positionChoosed[i] = myscanner.nextFloat();
                }
                startingPositionChoice(positionChoosed);
        }

    }
    private void startingPositionChoice(float[] positionChoosed){
        Scanner myscanner = new Scanner(System.in);

        System.out.println("Choose color: ");
        String color= myscanner.nextLine();

        System.out.println("Choose material: ");
        String material= myscanner.nextLine();

        System.out.println("Choose Wallpaper: ");
        String newWallpaper= myscanner.nextLine();
        Wall newWall=new Wall(this.room,color,material,newWallpaper,new Corner(this.room,positionChoosed[0],positionChoosed[1]));
    }

    private void startingPositionChoice(Corner startingCorner){
        Scanner myscanner = new Scanner(System.in);

        System.out.println("Choose color: ");
        String color= myscanner.nextLine();

        System.out.println("Choose material: ");
        String material= myscanner.nextLine();

        System.out.println("Choose Wallpaper: ");
        String newWallpaper= myscanner.nextLine();

        Wall newWall=new Wall(this.room,color,material,newWallpaper,cornerChoosed);
        endingPositionChoice(startingCorner);
    }

    private void endingPositionChoice(Corner startingCorner){

        

    }
}
