package code.house;
import code.house.room.Room;

import java.util.*;

import code.*;




public class House  {
    private ArrayList<Room> roomList;
    House(){

    }



    public HashMap countRoomTypes(){
        HashMap<RoomType, Integer> numberRoomTypes=new HashMap<RoomType,Integer>();
        for (Room roomIterator:roomList)
        {
            ArrayList<RoomType> roomTypeListIterator=roomIterator.getRoomType();
            for (RoomType roomTypeIterator:roomTypeListIterator) {
                if (numberRoomTypes.containsKey(roomTypeIterator)) {

                    numberRoomTypes.put(roomTypeIterator, numberRoomTypes.get(roomTypeIterator) + 1);
                } else {
                    numberRoomTypes.put(roomTypeIterator, 1);
                }
            }
        }
        return  numberRoomTypes;
    }
    public HashSet<String> getAllNames() {
        HashSet<String> roomNameSet=new HashSet<String>();

        for (Room room:roomList){

            roomNameSet.add(room.getName());

        }
        return  roomNameSet;
    }


    public void addRoom(Room room){

        this.roomList.add(room);
    }








    }


}
