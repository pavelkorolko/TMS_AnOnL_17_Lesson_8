package Tasks.SecondTask;

public class Main {
    public static void main(String[] args) {
        User[] users = new User[]{
                new Accountant(30, "Josh"),
                new Director(40, "John"),
                new Worker(20, "Peter"),
        };

        for (var user : users) {
            System.out.println(user.printJobPosition());
        }
    }
}
