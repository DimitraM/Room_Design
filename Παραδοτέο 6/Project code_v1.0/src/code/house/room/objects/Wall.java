<<<<<<< HEAD:Παραδοτέο 6/Project code_v1.0/src/code/house/room/objects/Wall.java
package code.house.room.objects;
import code.house.room.Room;
import code.house.room.objects.Objects;
import code.house.room.objects.Corner;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Chrysoula
 */

       import java.awt.Color;
import java.lang.String;
import java.util.Scanner;

import static java.lang.Math.abs;

<<<<<<< HEAD:Παραδοτέο 6/Project code_v1.0/src/code/house/room/objects/Wall.java
=======
package house.room.objects;

import java.awt.Color;
import java.lang.String;
import java.util.Scanner;

>>>>>>> 58c92ea2 (code combined):Παραδοτέο 5/Project code 0.1 Vanilia/Room Design 0.1/src/house/room/objects/Wall.java
=======
>>>>>>> e5bff795 (telikος κώδικας):Παραδοτέο 6/Project code 1.0/src/code/house/room/objects/Wall.java
/**
 *
 * @author Chrysoula
 */
<<<<<<< HEAD:Παραδοτέο 6/Project code_v1.0/src/code/house/room/objects/Wall.java
public class Wall extends Objects {

    private String wallpaper; 

    private String color;
    private String material;

    private float height;
    private ArrayList<Corner> corners;
    private float[][] wallPoints;
    private String axis;
    //Wall constructor when we don't know the  size of the wall at the start
    public Wall(Room room,String color,String material,String wallpaper,Corner corner){
        super(room);
        this.color = color;
        this.material = material;
        this.wallpaper = wallpaper;
        this.corners.add(corner);
        room.addWall(this);
    }

    //Wall constructor when we  know the  size of the wall at the start,so we create both corners from the starts
    public Wall(Room room, String color, String material, String wallpaper, float length, float width, String wallToBeCreated) {
        super(room);
        this.color = color;
        this.material = material;
        this.wallpaper = wallpaper;

        ArrayList<Float> creatingSides = new ArrayList<Float>();

        //We check if we want to create the wall of the x axis or y axis
        if (wallToBeCreated.equals("length"))//x axis
        {

            creatingSides.add(length/2);
            creatingSides.add(-length/2);
        //Create the wall at the y axis, using the width to take distance from the center
        }
        else if (wallToBeCreated.equals("width"))
        {
            creatingSides.add(width/2);
            creatingSides.add(-width/2);
        }
        float distanceFromExistingCorner;
        for (float side:creatingSides){
            for (Corner existingCorner:room.getCorners()){
               if (wallToBeCreated.equals("length")){
                   distanceFromExistingCorner=existingCorner.getDistance(side,width);
               }
               else if (wallToBeCreated.equals("width")){
                   distanceFromExistingCorner=existingCorner.getDistance(width,side);
               }
                if (distanceFromExistingCorner<0.06 && existingCorner.isNotFull())//if an existing corner is less than 6 centimetres in distance,
                                                // and doesn't have already two walls,add the existing corner and don't create new corner
                {
                    corners.add(existingCorner);
                    creatingSides.remove(side);
                    break;
                }

            }
        }
        for (float side:creatingSides){
            if (wallToBeCreated.equals("length")){
                corners.add(new Corner(room,side,width,this));
            }
            else if (wallToBeCreated.equals("width")){
                corners.add(new Corner(room,length,side,this));
            }

        }
        setWallParts()
    room.addWall(this);
    }
    //to add the second corner of the wall, return false if the wall already has two corners

    public boolean addCorner(Corner corner){
        if (corners.size()<2){
            corners.add(corner);
            corner.
            return true;
        }
        else return false;

    }

    public void deleteWall(){
    /*Delete every occurrence at the wall at the corners of the room*/
        for (Corner deletedCorner:room.getCorners()){

            if (deletedCorner.getWalls().contains(this)){
                deletedCorner.getWalls().remove(this);
                if (deletedCorner.isEmpty()) {
                    room.getCorners().remove(deletedCorner);
                }

            }
        }
        room.getWalls().remove(this);
    }

    public void emptyWallPoints() {
        this.wallPoints = null;
    }

    private void setWallParts(){
        //Find the axis where the wall is sprawing. We can only have orthodoxical walls

        float x_axis_distance=abs(corners.get(0).getLength()-corners.get(1).getLength());
        float y_axis_distance=abs(corners.get(0).getWidth()-corners.get(1).getWidth());
        //the axis where it does change its value, it becomes the axis of the wall
        if (x_axis_distance!=0 && y_axis_distance==0){
            axis="x-axis";
        }
        else if(x_axis_distance==0 && y_axis_distance!=0){

            axis="y-axis";
        }
        else {
            //Wall is a diagonal not a orthodoxical wall
            axis="both-axis";
        }
        float bigger_number;
        float smaller_number;
        switch (axis){

            case "x-axis":
                width=corners.get(0).getWidth();
                if (corners.get(0).getLength()>corners.get(1).getLength()){

                    bigger_number=corners.get(0).getLength();
                    smaller_number=corners.get(1).getLength();
                }
                else{
                    bigger_number=corners.get(1).getLength();
                    smaller_number=corners.get(0).getLength();
                }
                wallPoints=new float[(int)(x_axis_distance*100)][3];
                for (float i=smaller_number;i<=bigger_number;i=(float)(i+0.01)){

                    wallPoints[(int)(i*100)]= new float[]{i, width, 0};

                }

                break;
            case "y-axis":
                length=corners.get(0).getLength();
                if (corners.get(0).getWidth()>corners.get(1).getWidth()){

                    bigger_number=corners.get(0).getWidth();
                    smaller_number=corners.get(1).getWidth();
                }
                else{
                    bigger_number=corners.get(1).getWidth();
                    smaller_number=corners.get(0).getWidth();
                }
                wallPoints=new float[(int)(x_axis_distance*100)][3];
                for (float i=smaller_number;i<=bigger_number;i=(float)(i+0.01)){
                    wallPoints[(int)(i*100)]= new float[]{getLength(), i, 0};
                }
                break;
        }


    }



    public String getAxis() {
        return axis;
    }


<<<<<<< HEAD:Παραδοτέο 6/Project code_v1.0/src/code/house/room/objects/Wall.java
=======
public class Wall extends Objects{
    
    private String color; 
    private String material; 
    private String wallpaper; 
    
   
    //Wall contructor
    public Wall(String color,String material,String wallpaper){
        
        this.color = color;
        this.material = material;
        this.wallpaper = wallpaper;
    }

    
    
    /*****GETTERS AND SETTERS FOR PRIVATE VARIABLES*****/
    //Color
    public String getColor()
    {
        return color;
    }
    
    public void setColor(String newColor)
    {
        this.color = newColor;
    }
    
     //Wallpaper
>>>>>>> 58c92ea2 (code combined):Παραδοτέο 5/Project code 0.1 Vanilia/Room Design 0.1/src/house/room/objects/Wall.java
=======
>>>>>>> e5bff795 (telikος κώδικας):Παραδοτέο 6/Project code 1.0/src/code/house/room/objects/Wall.java
    public String getWallpaper()
    {
        return wallpaper;
    }
    
    public void setWallpaper(String newWallpaper)
    {
        this.material = newWallpaper;
    }
<<<<<<< HEAD:Παραδοτέο 6/Project code_v1.0/src/code/house/room/objects/Wall.java
<<<<<<< HEAD:Παραδοτέο 6/Project code_v1.0/src/code/house/room/objects/Wall.java
=======
>>>>>>> e5bff795 (telikος κώδικας):Παραδοτέο 6/Project code 1.0/src/code/house/room/objects/Wall.java



    @Override
    public String toString() {
        return "Wall{" + "color=" + color + ", material=" + material + ", wallpaper=" + wallpaper + '}';
    }
       

    //method with which the user will choose a specific piece of wall to edit:
    public void chooseWallpiece(Wall x, Room room) {
        System.out.println("Choose the piece of the wall you want to edit. /n Starting point: "); 
        
        Scanner myscannerStart = new Scanner(System.in);
        float startingPoint[]=new float[3];
        for (int i=0;myscannerStart.hasNext();i++) {
             startingPoint[i]= myscannerStart.nextFloat();
        }
        
        System.out.println("/n Ending point: "); 
        Scanner myscannerEnd = new Scanner(System.in);     
        float endingPoint[] = new float[3];
        for (int i=0;myscannerEnd.hasNext();i++) {
            endingPoint[i]= myscannerEnd.nextFloat();
        }
        if (this.getCorners().contains(startingPoint) && endingPoint == x.getLength()){
            System.out.println("Whole wall selected");
            //we need to make getFurniture()
        }
        
        else if (startingPoint<0 || endingPoint > x.getLength()){
            System.out.println("Invalid input. Check wall's length.");
            chooseWallpiece(x, room);
        }
        else{
            if(startingPoint==0){
                Wall selectedWall = new Wall(x.getColor(), x.getMaterial(), x.getWallpaper(), x.getWidth(), endingPoint, x.getHeight());
                Wall restofWall = new Wall(x.getColor(), x.getMaterial(), x.getWallpaper(), x.getWidth(), x.getLength() - endingPoint, x.getHeight());
                x = null;
                System.out.println("Your wall piece: " + selectedWall.toString());
                room.addWall(restofWall);
                room.addWall(selectedWall);
            }
            else if(startingPoint>0 || endingPoint < x.getLength()){
                Wall restofWall_1 = new Wall(x.getColor(), x.getMaterial(), x.getWallpaper(), x.getWidth(), startingPoint, x.getHeight());
                Wall selectedWall = new Wall(x.getColor(), x.getMaterial(), x.getWallpaper(), x.getWidth(), endingPoint - startingPoint, x.getHeight());
                Wall restofWall_2 = new Wall(x.getColor(), x.getMaterial(), x.getWallpaper(), x.getWidth(), x.getLength() - endingPoint, x.getHeight());
                x = null;
                System.out.println("Your wall piece: " + selectedWall.toString());
                room.addWall(restofWall_1);
                room.addWall(selectedWall);
                room.addWall(restofWall_2);
            }
            else if(endingPoint == x.getLength()){
                Wall restofWall = new Wall(x.getColor(), x.getMaterial(), x.getWallpaper(), x.getWidth(), startingPoint, x.getHeight());
                Wall selectedWall = new Wall(x.getColor(), x.getMaterial(), x.getWallpaper(), x.getWidth(), endingPoint - startingPoint, x.getHeight());
                x = null;
                System.out.println("Your wall piece: " + selectedWall.toString());
                room.addWall(restofWall);
                room.addWall(selectedWall);
            }
            
        }
    }
    
    public void chooseEditingType(Wall wall){
        System.out.println("Editing Options:/n (1)Change color /n (2)Change material /n (3)Change wallpaper/n (4)Change wall structure"); //user's choices to edit
        
        Scanner myscanner = new Scanner(System.in); 
        int response = myscanner.nextInt();
        
        switch(response) {
        case 1:
            //changeColor(selectedWall);
        case 2:
            //changeMaterial(selectedWall);
        case 3:
            //changeWallpaper(selectedWall);
        case 4:
            //changeWallStructure(selectedWall);
        }
    }

    public float[][] getWallPoints() {
        return wallPoints;
    }

    public ArrayList<Corner> getCorners() {
        return corners;
    }

    public void changeColor(Wall wall){
        System.out.println("Choose color: ");
        Scanner myscanner = new Scanner(System.in); 
        
        String newColor= myscanner.nextLine();
        wall.setColor(newColor);
    }
    
    public void changeMaterial(Wall wall){
        System.out.println("Choose material: ");
        Scanner myscanner = new Scanner(System.in); 
        
        String newMaterial= myscanner.nextLine();
        wall.setMaterial(newMaterial);
    }
    
    public void changeWallpaper(Wall wall){
        System.out.println("Choose Wallpaper: ");
        Scanner myscanner = new Scanner(System.in); 
        
        String newWallpaper= myscanner.nextLine();
        wall.setWallpaper(newWallpaper);
    }
    
    public void changeWallStructure(Wall wall){
        
    }

}
=======
    
    //Material
    public String getMaterial()
    {
        return material;
    }
    
    public void setMaterial(String newMaterial)
    {
        this.material = newMaterial;
    }
    
        
       
    }

>>>>>>> 58c92ea2 (code combined):Παραδοτέο 5/Project code 0.1 Vanilia/Room Design 0.1/src/house/room/objects/Wall.java
