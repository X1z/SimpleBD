package database.entity;

/**
 * Created by X1z on 12.02.2016.
 */
public class Book  extends EntityAbs{
    private String name;
    private String autor;
    private int count;

    public Book(int id) {
        super(id);
    }

    public Book(int id, String name, String autor, int count) {
        super(id);
        this.name = name;
        this.autor = autor;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Book{" +"id"+ this.getId()+
                "name='" + name + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
