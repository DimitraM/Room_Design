<<<<<<< HEAD:Παραδοτέο 6/Project code_v1.0/src/code/house/room/objects/Objects.java
package code.house.room.objects;

import code.house.room.Room;

import java.text.DecimalFormat;

import static java.lang.Math.*;

public abstract class Objects {
    protected float[] position; //syntetagmenes x, y, z enos antikeimenoy
    protected float height ;
    protected float width ;
    protected float length;
    protected String color; 
    protected String material; 

    protected Room room;
    protected Objects(Room room,float length, float width, float height){
        this.room=room;
        this.length=length;
        this.width=width;
        this.height=height;
        this.position=new float[]{this.length,this.width,this.height};
    }
    protected Objects(Room room){
        this.room=room;
    }
    //Count the distance of the object relative to an another object,Euklidean reason
    public float getDistance(Objects object){
        float distance;
        DecimalFormat df = new DecimalFormat("0.00");
        //distance is equal to squarte root of (x-x1)^2+(y-y1)^2+(z-z1)^2
        distance=(float)sqrt(pow(this.length-object.getLength(),2)+pow(this.width-object.getWidth(),2)+pow(this.height-object.getHeight(),2));
        return Float.valueOf(df.format(distance));
    }

    //When we want to calculate an object we want to put into a room,not an object we have right now
    public float getDistance(float length,float width,float height){
        float distance;
        DecimalFormat df = new DecimalFormat("0.00");
        //distance is equal to squarte root of (x-x1)^2+(y-y1)^2+(z-z1)^2
        distance=(float)sqrt(pow(this.length-length,2)+pow(this.width-width,2)+pow(this.height-height,2));
        return Float.valueOf(df.format(distance));
    }

    //When height doesn't matter at the position, mostly on corners
    public float getDistance(float length,float width){
        float distance;
        DecimalFormat df = new DecimalFormat("0.00");
        //distance is equal to squarte root of (x-x1)^2+(y-y1)^2+(z-z1)^2
        distance=(float)sqrt(pow(this.length-length,2)+pow(this.width-width,2));
        return Float.valueOf(df.format(distance));
    }
    //Manhattan distance calculates the distance between two points based of the axis, it cannot calculate diagonally
    public float getManhattanDistance(Objects object){
        float distance;
        DecimalFormat df = new DecimalFormat("0.00");
        //distance is equal to squarte root of (x-x1)^2+(y-y1)^2+(z-z1)^2
        distance=(float)abs(this.length-object.getLength())+abs(this.width-object.getWidth())+abs(this.height-object.getHeight()));
        return Float.valueOf(df.format(distance));
    }
    public float getManhattanDistance(float length,float width,float height){
        float distance;
        DecimalFormat df = new DecimalFormat("0.00");
        //distance is equal to squarte root of (x-x1)^2+(y-y1)^2+(z-z1)^2
        distance=(float)abs(this.length-length)+abs(this.width-width)+abs(this.height-height);
        return Float.valueOf(df.format(distance));
    }
    public float getManhattanDistance(float length,float width){
        float distance;
        DecimalFormat df = new DecimalFormat("0.00");
        //distance is equal to squarte root of (x-x1)^2+(y-y1)^2+(z-z1)^2
        distance=(float)abs(this.length-length)+abs(this.width-width) ;
        return Float.valueOf(df.format(distance));
    }



    /*****GETTERS AND SETTERS*****/
    public float[] getPosition() {
        return position;
    }

    public void setPosition(float[] position) {
        this.position = position;
    }

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

    //Color
    public String getColor()
    {
        return color;
    }
    
    public void setColor(String newColor)
    {
        this.color = newColor;
    }
    
    
    
    //Material
    public String getMaterial()
    {
        return material;
    }
    
    public void setMaterial(String newMaterial)
    {
        this.material = newMaterial;
    }

    public Room getRoom(){return room;}

=======
package house.room.objects;

public class Objects {
>>>>>>> 58c92ea2 (code combined):Παραδοτέο 5/Project code 0.1 Vanilia/Room Design 0.1/src/house/room/objects/Objects.java

}
