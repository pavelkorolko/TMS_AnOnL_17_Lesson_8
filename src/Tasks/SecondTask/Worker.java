package Tasks.SecondTask;

public class Worker extends User implements Printable {

    public Worker(int age, String name) {
        super(age, name);
    }

    @Override
    public String printJobPosition() {
        return "I'm worker, whose name " + name + " and " + age + " years old!";
    }
}
