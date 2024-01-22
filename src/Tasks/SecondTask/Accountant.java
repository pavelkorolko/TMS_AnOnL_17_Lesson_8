package Tasks.SecondTask;

public class Accountant extends User implements Printable {

    public Accountant(int age, String name) {
        super(age, name);
    }

    @Override
    public String printJobPosition() {
        return "I'm accountant, whose name " + name + " and " + age + " years old!";
    }
}
