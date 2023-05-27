package house.room.objects;

abstract class Objects {
    private float[] position = new float[3]; // position of an object is
    // consisted of x, y and z axis values

    private float height;
    private float width;
    private float length;

    public abstract Object choose_object();
    public abstract void post_restrictions();
    public abstract void check_rooms_objects();
    public abstract void change_furn_loc();

    public abstract void saveChanges();
    public abstract void deleteChanges();
}
