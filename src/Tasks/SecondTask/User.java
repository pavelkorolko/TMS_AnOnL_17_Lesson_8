package Tasks.SecondTask;

public abstract class User implements Printable{
    int age;
    String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
