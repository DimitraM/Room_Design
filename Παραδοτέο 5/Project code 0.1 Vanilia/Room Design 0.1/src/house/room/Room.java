package house.room;
import java.util.ArrayList;

import Enums.RoomType;
import house.room.objects.Furniture;
import house.room.objects.Openings;

public class Room {
    private RoomType type;
    private ArrayList<Furniture> items; 
    private ArrayList<Openings> doors;

    //constructors
    public Room(RoomType type) {
        this.type=type;
    }

    public Room()
    {
        items = new ArrayList<Furniture>();
        doors = new ArrayList<Openings>(); 
    }

    public void addItems(Furniture furniture)
    {
        items.add(furniture);
    }

    public void addOpenings(Openings opening)
    {
        doors.add(opening);
    }

    public RoomType getType(){return  type;} //getter
    

    public void sortOptions(RoomType type){
        //this method sorts options in list for user to add
        if(doors==null){
           //show only openings firsts 
        }
        

    }
}
