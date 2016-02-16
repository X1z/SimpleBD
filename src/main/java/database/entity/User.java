package database.entity;

/**
 * Created by X1z on 12.02.2016.
 */
public class User extends EntityAbs{

    private String name;
    private String tel;
    private int age;

    public User(int id) {
        super(id);
    }

    public User(int id, String name, String tel) {
        super(id);
        this.name = name;
        this.tel = tel;
    }

    public User(int id, String name, String tel, int age) {
        super(id);
        this.name = name;
        this.tel = tel;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", age=" + age +
                '}';
    }
}
