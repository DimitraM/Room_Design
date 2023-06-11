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

    public ArrayList<Wall> getWalls() {
        return walls;
    }
}
