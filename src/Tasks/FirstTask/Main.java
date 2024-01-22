package Tasks.FirstTask;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
                new Circle(50),
                new Rectangle(50, 10),
                new Triangle(50, 20, 30),
                new Circle(10),
                new Rectangle(60, 80),
        };

        double sum = 0;

        for (var item : shapes) {
            sum += item.getPerimeter();
        }

        System.out.printf("Sum of perimeters: %.2f%n", sum);
    }
}
