package code.house;
import code.house.room.Room;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import code.*;




public class Ηouse {

    private ArrayList<Room> roomList; //house saves all the rooms in this list
    Ηouse(){

    }


    //Count all the different roomTypes and their number of their apperances at the house

    public HashMap countRoomTypes(){
        HashMap<RoomType, Integer> numberRoomTypes=new HashMap<RoomType,Integer>();
        //We use 2 iterators to take multiple roomType
        for (Room roomIterator:roomList) {
            for (RoomType roomTypeIterator : roomIterator.getRoomType()) {
                if (numberRoomTypes.containsKey(roomTypeIterator)) {

                    numberRoomTypes.put(roomTypeIterator, numberRoomTypes.get(roomTypeIterator) + 1);
                } else {
                    numberRoomTypes.put(roomTypeIterator, 1);
                }
            }
        }
        return  numberRoomTypes;
    }

    public List sortRoomTypeList(){

        List <RoomType> sortedList= (List<RoomType>) RoomType.roomTypeSet;
        Map<RoomType, Integer>ExistingRooms=countRoomTypes();






    }


}
