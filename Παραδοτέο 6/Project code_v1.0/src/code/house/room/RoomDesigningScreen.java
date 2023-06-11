package code.house.room;

import code.RoomType;
import code.house.room.objects.Corner;
import code.house.room.objects.Wall;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class RoomDesigningScreen {

    Room room;
    RoomPlan roomPlan;
    public RoomDesigningScreen(Room room,RoomPlan roomPlan){

        this.room=room;
        this.roomPlan=roomPlan;

        this.chooseDesign();

    }
    public void chooseDesign(){

        System.out.println("Choose between inserting values for length and width (choose 1) or design Manually (choose 2)");
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        boolean legitInput=false;
        while(!legitInput){
            int parsedInt=Integer.parseInt(input);
            if (parsedInt==1){
                legitInput=true;
                this.insertValues();
            }
            else if(parsedInt==2){
                legitInput=true;
                this.designManually();;
            }
            else{
                System.out.println("Try again");
            }
        }
    }

    public void insertValues() {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scanner=new Scanner(System.in);
        String input;
        Float length;
        Float width;
        float minimumRecommendedLength=0;
        float maximumRecommendedLength=0;

        float minimumRecommendedWidth=0;
        float maximumRecommendedWidth=0;
        for (RoomType particularRoomType: room.getRoomType()){
             minimumRecommendedLength=minimumRecommendedLength+ particularRoomType.getMinimumRecommendedLength();
             maximumRecommendedLength=maximumRecommendedLength+ particularRoomType.getMaximumRecommendedLength();

             minimumRecommendedWidth=minimumRecommendedWidth+ particularRoomType.getMinimumRecommendedWidth();
             maximumRecommendedWidth=maximumRecommendedWidth+ particularRoomType.getMaximumRecommendedWidth();
        }
        minimumRecommendedLength=minimumRecommendedLength/room.getRoomType().size();
        maximumRecommendedLength=maximumRecommendedLength/room.getRoomType().size();

        minimumRecommendedWidth=minimumRecommendedWidth/room.getRoomType().size();
        maximumRecommendedWidth=maximumRecommendedWidth/room.getRoomType().size();

        System.out.println("The recommended size of the room is between "+minimumRecommendedLength+"x"
        +minimumRecommendedWidth+" and "+maximumRecommendedLength+"x"+maximumRecommendedWidth);
        System.out.println("Put first the length,press enter and then the width.");

        input=scanner.nextLine();
        length= Float.valueOf(df.format(Float.parseFloat(input)));
        input=scanner.nextLine();
        width= Float.valueOf(df.format(Float.parseFloat(input)));
        if (length==null){
            length=Float.valueOf((df.format((minimumRecommendedLength+maximumRecommendedLength)/2));
        }
        if (width==null){
            width=Float.valueOf(df.format((minimumRecommendedWidth+maximumRecommendedWidth)/2));
        }

        Scanner myscanner = new Scanner(System.in);

        System.out.println("Choose color: ");
        String color= myscanner.nextLine();

        System.out.println("Choose material: ");
        String material= myscanner.nextLine();

        System.out.println("Choose Wallpaper: ");
        String newWallpaper= myscanner.nextLine();
        //Create an 4 wall room
        room.addWall(new Wall(room,color,material,newWallpaper,length,width,"length"));
        room.addWall(new Wall(room,color,material,newWallpaper,-length,width,"length"));
        room.addWall(new Wall(room,color,material,newWallpaper,length,width,"width"));
        room.addWall(new Wall(room,color,material,newWallpaper,length,-width,"width"));
        this.setWallsHeight();
    }
    public void setWallsHeight(){

        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scanner=new Scanner(System.in);
        String input;
        Float height;
        float minimumRecommendedHeight=0;
        float maximumRecommendedHeight=0;
        for (RoomType particularRoomType: room.getRoomType()){
            minimumRecommendedHeight=minimumRecommendedHeight+ particularRoomType.getMinimumRecommendedHeight();
            maximumRecommendedHeight=maximumRecommendedHeight+ particularRoomType.getMaximumRecommendedHeight();
        }
        minimumRecommendedHeight=minimumRecommendedHeight/room.getRoomType().size();
        maximumRecommendedHeight=maximumRecommendedHeight/room.getRoomType().size();

        input=scanner.nextLine();
        height= Float.valueOf(df.format(Float.parseFloat(input)));

        if (height==null){
            height=Float.valueOf((df.format((minimumRecommendedHeight+maximumRecommendedHeight)/2)));
        }

        for (Wall existingWall: room.getWalls()){
            existingWall.setHeight(height);
        }
    }

    public void designManually(){

        boolean userContinuing=true;
        int amountOfWalls=0;

        while ((userContinuing==true && amountOfWalls>2) || amountOfWalls<2){

            ArrayList <Corner> lackingCorners=room.takeLackingCorners();
            if (amountOfWalls!=0 && lackingCorners.isEmpty()==false){

                roomPlan.chooseWall().deleteWall();
            }
            if (room.getWalls()!=null){
                System.out.println("Do you want to add a new wall or delete an existing one");
                Scanner myscanner = new Scanner(System.in);
                String choose= myscanner.nextLine();
                if (choose.equalsIgnoreCase("delete")){

                    roomPlan.chooseWall().deleteWall();
                }
            }
            roomPlan.showcaseDrawingPoints(lackingCorners);

        }
    }




}
