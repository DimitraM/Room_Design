import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Chrysoula
 */
public class mainClass {
    public static void main (String[] args)
    {
       import java.awt.Color;
import java.lang.String;
import java.util.Scanner;

/**
 *
 * @author Chrysoula
 */
public class Wall extends Objects{

    private String wallpaper; 
    
    
    //Wall contructor
    public Wall(String color,String material,String wallpaper, float width, float length, float height){
        
        this.color = color;
        this.material = material;
        this.wallpaper = wallpaper;
        this.width=width;
        this.length=length;
        this.height=height;
    }

    public Wall(){
    }
    
     //Wallpaper getter, setter
    public String getWallpaper()
    {
        return wallpaper;
    }
    
    public void setWallpaper(String newWallpaper)
    {
        this.material = newWallpaper;
    }
    
    @Override
    public String toString() {
        return "Wall{" + "color=" + color + ", material=" + material + ", wallpaper=" + wallpaper + '}';
    }
       

    //method with which the user will choose a specific piece of wall to edit:
    public void chooseWallpiece(Wall x, Room room) {
        System.out.println("Choose the piece of the wall you want to edit. /n Starting point: "); 
        
        Scanner myscannerStart = new Scanner(System.in);     
        float startingPoint = myscannerStart.nextFloat();
        
        
        System.out.println("/n Ending point: "); 
        Scanner myscannerEnd = new Scanner(System.in);     
        float endingPoint = myscannerEnd.nextFloat();
        
        if (startingPoint==0 && endingPoint == x.getLength()){
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