package code.house.room.objects;

import code.house.room.Room;

import java.util.ArrayList;

public class Corner extends Objects{

    private ArrayList<Wall> walls;

    public Corner(Room room,float length,float width){

        super(room,length,width,0);
        walls.add(new Wall(this.room,"white","concrete","none",this));
        room.addCorner(this);
    }
    public Corner(Room room,float length,float width,Wall wall){
        super(room,length,width,0);
        walls.add(wall);
        room.addCorner(this);
    }

    public boolean isNotFull(){

        return walls.size() < 2;

    }

    public boolean isEmpty(){
        return walls.size() == 0;

    }
    public void deleteCorner(){

        for (Wall wallAffected:this.walls){
            if (wallAffected.getCorners().contains(this)) {
                wallAffected.emptyWallPoints();
                //delete all the occurances of the corner
                wallAffected.getCorners().remove(this);
            }
        }
        room.getCorners().remove(this);
    }
    public ArrayList<Wall> getWalls() {
        return walls;
    }
    public boolean addWall(Wall newWall){
       if (walls.size()<2){
           this.walls.add(newWall);

       }

    }
}
