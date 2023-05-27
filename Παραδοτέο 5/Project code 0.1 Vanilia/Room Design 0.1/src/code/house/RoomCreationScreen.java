package code.house;

import code.RoomType;
import code.house.CustomRoomListSort.RoomListSort;

import java.util.ArrayList;

public class RoomCreationScreen {
    House house;
    ArrayList <RoomType> roomList;
    public RoomCreationScreen(House house){

        this.house=house;
        this.roomList=new RoomListSort(house).getRoomList();
        ArrayList<RoomType> userRoomTypeChoice=new ArrayList<RoomType>();



    }




}
