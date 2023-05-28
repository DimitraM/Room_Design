package code.house.room;

import code.RoomType;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RoomDesigningScreen {

    Room room;

    public RoomDesigningScreen(Room room){

        this.room=room;
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
        Double length=new Double();
        Double width=new Double();
        double minimumRecommendedLength=0;
        double minimumRecommendedWidth=0;
        double maximumRecommendedLength=0;
        double maximumRecommendedWidth=0;
        for (RoomType particularRoomType: room.getRoomType()){
             minimumRecommendedLength=minimumRecommendedLength+ particularRoomType.getMinimumRecommendedLength();
             minimumRecommendedWidth=minimumRecommendedWidth+ particularRoomType.getMinimumRecommendedWidth();
             maximumRecommendedLength=maximumRecommendedLength+ particularRoomType.getMaximumRecommendedLength();
             maximumRecommendedWidth=maximumRecommendedWidth+ particularRoomType.getMaximumRecommendedWidth();
        }
        minimumRecommendedLength=minimumRecommendedLength/room.getRoomType().size();
        minimumRecommendedWidth=minimumRecommendedWidth/room.getRoomType().size();
        maximumRecommendedLength=maximumRecommendedLength/room.getRoomType().size();
        maximumRecommendedWidth=maximumRecommendedWidth/room.getRoomType().size();

        System.out.println("The recommended size of the room is between "+minimumRecommendedLength+"x"
        +minimumRecommendedWidth+" and "+maximumRecommendedLength+"x"+maximumRecommendedWidth);
        System.out.println("Put first the length,press enter and then the width.");

        input=scanner.nextLine();
        length= Double.valueOf(df.format(Double.parseDouble(input)));
        input=scanner.nextLine();
        width= Double.valueOf(df.format(Double.parseDouble(input)));
        if (length==null){
            length=Double.valueOf(df.format((minimumRecommendedLength+maximumRecommendedLength)/2));
        }
        if (width==null){
            width=Double.valueOf(df.format((minimumRecommendedWidth+maximumRecommendedWidth)/2));
        }



    }

    public void designManually(){

    }




}
