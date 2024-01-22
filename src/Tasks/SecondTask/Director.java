package Tasks.SecondTask;

public class Director extends User implements Printable{
    public Director(int age, String name) {
        super(age, name);
    }

    @Override
    public String printJobPosition() {
        return "I'm director, whose name " + name + " and " + age + " years old!";
    }
}
