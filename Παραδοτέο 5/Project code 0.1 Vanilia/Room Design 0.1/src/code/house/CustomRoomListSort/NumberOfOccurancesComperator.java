package code.house.CustomRoomListSort;

import code.RoomType;

import java.util.Comparator;
import java.util.HashMap;

//We sort the list based of the number of occurance a room type of the existing house
//comparing the element of the sublist we have taken
public class NumberOfOccurancesComperator implements Comparator<RoomType> {
    private HashMap<RoomType,Integer> existingRooms;

    public NumberOfOccurancesComperator(HashMap existingRooms) {
        this.existingRooms = existingRooms;
    }

    @Override
    public int compare(RoomType o1, RoomType o2) {
        int result= existingRooms.get(o1) - existingRooms.get(o2);
        if(result!=0){
            return 0;
        }
        else{
            return new NameComperator().compare(o1,o2);
        }
    }
}
