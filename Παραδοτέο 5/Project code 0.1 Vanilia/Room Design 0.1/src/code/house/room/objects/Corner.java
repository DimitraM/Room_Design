package code.house.room.objects;

import code.house.room.Room;

import java.util.ArrayList;

public class Corner extends Objects{
    private Room room;
    private ArrayList<Wall> walls;
    public Corner(float length,float width){

        super(length,width,0);
        walls.add(new Wall(this.room,"white","concrete","none",this));

    }
    public Corner(float length,float width,Wall wall){

        room=wall.getRoom();
        super(length,width,0);
        walls.add(wall);
    }

    public boolean isNotFull(){

        if (walls.size()<2){
            return true;
        }
        else {
            return false;
        }

    }
}
