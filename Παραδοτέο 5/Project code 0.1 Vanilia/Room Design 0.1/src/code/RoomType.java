package code;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public  class RoomType {

        public static HashSet<RoomType> roomTypeSet;
        private String name;
        private int priority;
        private float minimumRecommendedLength;
        private float minimumRecommendedWidth;
        private float minimumRecommendedHeight;

        private float maximumRecommendedLength;
        private float maximumRecommendedWidth;
        private float maximumRecommendedHeight;


        RoomType(String name,int priority,float minimumRecommendedHeight,float minimumRecommendedLength,float minimumRecommendedWidth
        ,float maximumRecommendedHeight,float maximumRecommendedLength,float maximumRecommendedWidth){


            this.priority=priority;
            this.name=name;
            this.minimumRecommendedHeight=minimumRecommendedHeight;
            this.minimumRecommendedWidth=minimumRecommendedWidth;
            this.minimumRecommendedLength=minimumRecommendedLength;
            this.maximumRecommendedHeight=maximumRecommendedHeight;
            this.maximumRecommendedWidth=maximumRecommendedWidth;
            this.maximumRecommendedLength=maximumRecommendedLength;
        }

        public static void roomTypeInitialization(){

            roomTypeSet.add(new RoomType("bedroom",0,2.2,3,3
                    ,3,4.3,4.9));

            roomTypeSet.add(new RoomType("toilet"))
        }


    public static RoomType getParticularRoomType(String roomTypeName){


         for (RoomType potentialParticularRoomType:roomTypeSet){
             if (roomTypeName.equalsIgnoreCase(potentialParticularRoomType.getName())){
                 return potentialParticularRoomType;
             }
         }
         return null;

    }


    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public float getMinimumRecommendedLength() {
        return minimumRecommendedLength;
    }

    public float getMinimumRecommendedWidth() {
        return minimumRecommendedWidth;
    }

    public float getMinimumRecommendedHeight() {
        return minimumRecommendedHeight;
    }

    public float getMaximumRecommendedLength() {
        return maximumRecommendedLength;
    }

    public float getMaximumRecommendedWidth() {
        return maximumRecommendedWidth;
    }

    public float getMaximumRecommendedHeight() {
        return maximumRecommendedHeight;
    }
}


        /*
        public  static void roomTypeFormingInitialization() {
            Scanner input=new Scanner(System.in);
            try {
                File RoomTypeText = new File("Project code 0.1 Vanilia/Room Design 0.1/txt files/RoomType.txt");

                if (!RoomTypeText.exists()) {
                    RoomTypeText.createNewFile();
                }else
                    {
                        System.out.println("Do you want to rewrite the existing file or leave.Write \'rewrite\' for first and \'leave\' for second");
                        String decision=input.nextLine();
                        boolean noLegitInput=true;
                        while (noLegitInput){
                            if (decision.equalsIgnoreCase("rewrite")){
                                RoomTypeText.delete();
                                RoomTypeText.createNewFile();

                            }
                            else if (decision.equalsIgnoreCase("leave")){

                                noLegitInput=false;
                                System.out.println("noo");
                                return;
                            }
                        }
                    }


                    FileWriter filling = new FileWriter(RoomTypeText);




            for (int i = 0; i < 6; i++) {
                filling.write("name: {\n");
                filling.write("\tpriority:\n");
                filling.write("\tminimumRecommendedWidth: ,minimumRecommendedLength: ,minimumRecommendedHeight: \n");
                filling.write("\tmaximumRecommendedWidth: ,maximumRecommendedLength: ,maximumRecommendedHeight: \n");
                filling.write("}\n");
            }
            filling.close();
        }catch(IOException e){
                throw new RuntimeException(e);
            }
        }
        public int getPriority(){return this.priority;}

        public RoomType getRoomType(){return this;}



    }
*/

