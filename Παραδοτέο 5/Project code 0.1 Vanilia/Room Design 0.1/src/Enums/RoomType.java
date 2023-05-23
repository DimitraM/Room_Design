package Enums;

public enum RoomType {
    bedroom(0,new double[]{3.5,4},new [12,15],[12,15]);//kitchen(0),toilet(0),livingroom(1),hall(1),
   // corridor(1),balcony(1),studio(2),garden(2);

    private final int priority;
    private final double[] heightRecommendations;
    private final double[] widthRecommendations;
    private final float[] lenghttRecommendations;
    RoomType(int priority,float[] heightRecommendations,float[] widthRecommendations,float[] lenghttRecommendations){
        this.priority=priority;
        this.widthRecommendations=widthRecommendations;
        this.heightRecommendations=heightRecommendations;
        this.lenghttRecommendations=lenghttRecommendations;
    }

    public int getPriority(){return priority;}




}
