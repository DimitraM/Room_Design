package house;
import Enums.RoomType;
import house.room.Room;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class house {
    private ArrayList<Room> roomList;
    house(){

    }
    public HashMap countRoomTypes(){
        HashMap<RoomType, Integer> numberRoomTypes=new HashMap<RoomType,Integer>;
        for (Room roomIterator:roomList)
        {
            RoomType roomTypeIterator=roomIterator.getType();
            if (numberRoomTypes.containsKey(roomTypeIterator)){

                numberRoomTypes.put(roomTypeIterator,numberRoomTypes.get(roomTypeIterator)+1);
            }
            else{
                numberRoomTypes.put(roomTypeIterator,1);
            }
        }
        return  numberRoomTypes;
    }

}
