package code.house.CustomRoomListSort;

import code.RoomType;

import java.util.Comparator;

//We compare the priority of each roomType with each other in order to use it in the room creation Screen
public class PriorityComperator implements Comparator<RoomType> {

    public int compare(RoomType o1,RoomType o2) {
        return o1.getPriority()-o2.getPriority() //We want zero to be first of the list and we have ascending order
    }
}
