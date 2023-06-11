package code.house;
import code.house.room.Room;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import code.RoomType;




public class Ηouse {
    private ArrayList<Room> roomList;
    public Ηouse(){

    }



    public HashMap countRoomTypes(){
        HashMap<RoomType, Integer> numberRoomTypes=new HashMap<RoomType,Integer>();
        for (Room roomIterator:roomList) {
            ArrayList<RoomType> roomTypeIterator;
            roomTypeIterator = roomIterator.getRoomType();
            for (RoomType particularRoomTypeIterator : roomTypeIterator) {
                if (numberRoomTypes.containsKey(particularRoomTypeIterator)) {

                    numberRoomTypes.put(particularRoomTypeIterator, numberRoomTypes.get(particularRoomTypeIterator) + 1);
                } else {
                    numberRoomTypes.put(particularRoomTypeIterator, 1);
                }
            }
        }
        return  numberRoomTypes;
    }

    public List sortRoomTypeList(){

        List <RoomType> sortedList= (List<RoomType>) RoomType.roomTypeSet;
        Map<RoomType, Integer>ExistingRooms=countRoomTypes();

        return sortedList;
    }


}