package code.house;

import code.RoomType;
import code.house.CustomRoomListSort.RoomListSort;
import code.house.room.Room;
import code.house.room.RoomDesigningScreen;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringJoiner;

public class RoomCreationScreen {
    House house;
    ArrayList <RoomType> roomList;
    HashSet<String> nameSet;
    public RoomCreationScreen(House house){

        this.house=house;
        this.roomList=new RoomListSort(house).getRoomList();
        ArrayList<RoomType> userRoomTypeChoice=new ArrayList<RoomType>(this.userInputRoomType());
        Room newRoom=new Room(house,userRoomTypeChoice);

        this.nameSet=house.getAllNames();
        newRoom.setName(this.userInputRoomName());
        new RoomDesigningScreen(new Room);

        }


    public ArrayList<RoomType> userInputRoomType(){
        ArrayList<RoomType> userRoomTypeChoice=new ArrayList<RoomType>();

        String userInput;
        Scanner scannerUserInput=new Scanner(System.in);
        Boolean noLegitInput=true;
        while(noLegitInput){
            userInput=scannerUserInput.nextLine();
            userInput=userInput.trim();
            String[] userInputSplit;
            ArrayList<RoomType> usertempRoomTypeChoice=new ArrayList<RoomType>();
            if (!userInput.isEmpty()){

                userInputSplit=  userInput.split(",");
                if (userInputSplit.length<=3){
                    boolean allInputLegit=true;
                    for (String potentialRoomTypeName:userInputSplit){
                        RoomType potentialRoomType=RoomType.getParticularRoomType(potentialRoomTypeName);
                        if (potentialRoomType==null){
                            allInputLegit=false;
                            usertempRoomTypeChoice.clear();
                        }
                        else{
                            usertempRoomTypeChoice.add(potentialRoomType);

                        }
                    }
                    if (allInputLegit) {
                        noLegitInput=false;
                        userRoomTypeChoice.addAll(usertempRoomTypeChoice);
                    }

                }
            }
            else
            {

                userRoomTypeChoice.add(RoomType.getParticularRoomType("Generic");
                noLegitInput=false;
            }
        }
            return userRoomTypeChoice;

    }

    public String userInputRoomName(Room room) {
        String name;
        Scanner scannerUserInput=new Scanner(System.in);

        name=scannerUserInput.nextLine();
        name=name.trim();
        if (name.isEmpty()){
            StringJoiner joiner=new StringJoiner(" ");
            for(RoomType currentRoomType:room.getRoomType()) {
                joiner.add(currentRoomType.getName());
            }
            name=joiner.toString();
        }
        while (nameSet.contains(name)){
            Integer hyphenIndex = null;
            for (int i=name.length()-1;i>=name.length()-3 && hyphenIndex==null;i--){
                if (name.charAt(i)=='-'){
                    hyphenIndex=i;
                }
            }
            if (hyphenIndex==null){
                name.concat("1");
            }
            else{
                Integer number=Integer.parseInt(name.substring(hyphenIndex));
                number++;
                StringBuilder b = new StringBuilder(name);
                b.replace(hyphenIndex,name.length()-1,number.toString());
                name= b.toString();
            }

        }
        return name;
    }
}
