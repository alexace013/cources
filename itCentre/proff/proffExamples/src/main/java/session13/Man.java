package session13;

/**
 * Created with IntelliJ IDEA.
 * User: al1
 * Date: 27.09.14
 */
public class Man {
    private int age;
    private String name;

    public Man() {
    }

    public Man(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Man{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
