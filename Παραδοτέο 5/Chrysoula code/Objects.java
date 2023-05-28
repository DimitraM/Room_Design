public class Objects {
    protected float[] position = new float[3]; //syntetagmenes x, y, z enos antikeimenoy
    protected float height = 0;
    protected float width = 0;
    protected float length = 0;  
    protected String color; 
    protected String material; 
    
    
    
    /*****GETTERS AND SETTERS*****/
    public float[] getPosition() {
        return position;
    }

    public void setPosition(float[] position) {
        this.position = position;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    //Color
    public String getColor()
    {
        return color;
    }
    
    public void setColor(String newColor)
    {
        this.color = newColor;
    }
    
    
    
    //Material
    public String getMaterial()
    {
        return material;
    }
    
    public void setMaterial(String newMaterial)
    {
        this.material = newMaterial;
    }
    
    

}
