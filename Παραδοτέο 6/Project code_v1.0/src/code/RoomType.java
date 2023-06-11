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

            roomTypeSet.add(new RoomType("bedroom",0, 2.8,3,3
                    ,3.8,5,6));

            roomTypeSet.add(new RoomType("living room",1,2.8,3,3.5
                    ,3.2,6,8);
            roomTypeSet.add(new RoomType("kitchen",1,2.6,1.5,3
            ,3.6,3.6,6));
            roomTypeSet.add(new RoomType("bathroom",1,2.4,1.2,2.4
            ,3,2.4,3.7));
            roomTypeSet.add(new RoomType("office",2,2.8,3,3,
            3.5,4.3,5));
            roomTypeSet.add(new RoomType("Generic",99,2.8,3,3,
                    3.5,5,5));

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


