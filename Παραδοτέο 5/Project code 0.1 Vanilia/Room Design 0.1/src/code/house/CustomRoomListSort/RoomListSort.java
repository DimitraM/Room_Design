package code.house.CustomRoomListSort;

import code.RoomType;

import java.util.*;

import code.house.House;

import
public class RoomListSort {

    private House house;
    private ArrayList<RoomType> roomList;
    public RoomListSort(House house) {

        this.house = house;


    this.roomList = new ArrayList<>(RoomType.roomTypeSet);
    HashMap<RoomType, Integer> existingRooms =house.countRoomTypes();

    Collections.sort(roomList,new PriorityComperator());
    int first_occurence=0;
    int last_occurence=0;
    for (int i=0;i<roomList.size();i++){

        if (roomList.get(i).getPriority()!=roomList.get(last_occurence).getPriority()){

            Collections.sort(roomList.subList(first_occurence,last_occurence),new NumberOfOccurancesComperator(existingRooms));
            first_occurence=i;
        }
        last_occurence=i;
    }
}

    public ArrayList<RoomType> getRoomList() {
        return roomList;
    }
}
