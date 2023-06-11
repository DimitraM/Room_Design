package code.house.room;

import code.house.room.objects.Corner;
import code.house.room.objects.Wall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.abs;

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
        for (int i=0;myscanner.hasNext() && i<positionChoosed.length-1;i++) {
            positionChoosed[i]= myscanner.nextFloat();
        }
        positionChoosed[3]=0;

        if (!lackingCorners.isEmpty()) {
            for (Corner potentialCorner : lackingCorners) {

                System.out.println("Point that can be choosen to start the wall,only length and width:" + Arrays.toString(potentialCorner.getPosition()));
            }
            while (NoLegitCorner) {
                positionChoosed = new float[3];

                for (int i = 0; myscanner.hasNext() && i<positionChoosed.length-1; i++) {
                    positionChoosed[i] = myscanner.nextFloat();
                }
                positionChoosed[3]=0;
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
                for (int i = 0; myscanner.hasNext() && i<positionChoosed.length-1; i++) {
                    positionChoosed[i] = myscanner.nextFloat();
                }
                positionChoosed[3]=0;
                startingPositionChoice(positionChoosed);
                if ()
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
        endingPositionChoice(newWall);
    }

    private void startingPositionChoice(Corner startingCorner){
        Scanner myscanner = new Scanner(System.in);

        System.out.println("Choose color: ");
        String color= myscanner.nextLine();

        System.out.println("Choose material: ");
        String material= myscanner.nextLine();

        System.out.println("Choose Wallpaper: ");
        String newWallpaper= myscanner.nextLine();

        Wall newWall=new Wall(this.room,color,material,newWallpaper,startingCorner);
        endingPositionChoice(room.getWalls().get(room.getWalls().size()-1));
    }

    private void endingPositionChoice(Wall newWall){
        boolean canContinue=false;
        while(!canContinue)
        {
            float positionChoosed[]=new float[3];
            Scanner myscanner = new Scanner(System.in);
            System.out.println("Choose the position you want the wall to extends into");
            for (int i=0;myscanner.hasNext() && i<positionChoosed.length-1;i++) {
                positionChoosed[i] = myscanner.nextFloat();
            }
            positionChoosed[3]=0;
            if(positionChoosed==newWall.getPosition()) break;
            Corner endingCorner=new Corner(room,positionChoosed[0],positionChoosed[1],newWall);
            newWall.addCorner(endingCorner);
            float[][] newWallPoints=newWall.getWallPoints();

            boolean conflictingWallFound=false;
                for (Wall existingWall : room.getWalls()) {
                   if (conflictingWallFound) break;
                    for (float[] potentialConflictingPoint : existingWall.getWallPoints()) {
                        if (conflictingWallFound==true) break;
                        for (float[] newWallPoint : newWallPoints) {
                            if (newWallPoint==potentialConflictingPoint){
                                conflictingWallFound=true;
                                break;
                            }
                        }

                    }
                }
             if (conflictingWallFound) {
                 room.getWalls().get(room.getWalls().indexOf(newWall)).getCorners().remove(1);
             }
             else {
                 canContinue=true;
             }

        }
        checkCloseCorner(newWall.getCorners().get(1),newWall.getCorners().get(0));
    }
    public void checkCloseCorner(Corner testedCorner,Corner startingCorner){
        Corner newCorner;
        for (Corner potentialCloseCorner:room.getCorners()){
            //if it is both less than 6 centimeters at x and y axis from
            if (abs(testedCorner.getLength()-potentialCloseCorner.getLength())<0.06 &&
                    abs(testedCorner.getWidth()-potentialCloseCorner.getWidth())<0.06 &&
                    !potentialCloseCorner.equals(startingCorner) &&
                    potentialCloseCorner.isNotFull()) {
                =potentialCloseCorner;
                for (Wall wallAffected:room.getWalls()){

                    wallAffected.getCorners().set(wallAffected.getCorners().indexOf(testedCorner),potentialCloseCorner);
                }

            }
        System.out.println("The corner was merged to the existing corner",newCorner.getPosition().toString());
        }


    }
}
