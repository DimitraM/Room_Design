package code.house.CustomRoomListSort;

import code.RoomType;

import java.util.Comparator;

public class NameComperator implements Comparator {


    @Override
    public int compare(RoomType o1, RoomType o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
