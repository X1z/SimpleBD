package database.entity;

/**
 * Created by X1z on 12.02.2016.
 */
public abstract class EntityAbs {
    private int id;

    public EntityAbs(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
