package house.room;
import Enums.RoomType;
import house.room.objects.Objects;


public class Room {
    private RoomType type;
    // private Objects item;
    //these two extend the Objects class[parent class]
    //epipla
    //anoigmata
    int count=0; // counting number of items maybe

    public RoomType getType(){return  type;} //getter
    //public void setType(RoomType type){  this.type=type;} //setter den xerw an xreiazetai


    //constructor
    public Room(RoomType type) {
        this.type=type;
    }

    public void add(RoomType type){
        //this method inserts new items in the room.
        if(type==RoomType.toilet){
            
        }
        

    }
}
