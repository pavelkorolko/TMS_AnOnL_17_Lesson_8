package Tasks.FirstTask;

public class Triangle extends Shape {
    double side_1;
    double side_2;
    double side_3;

    public Triangle(double side_1, double side_2, double side_3) {
        this.side_1 = side_1;
        this.side_2 = side_2;
        this.side_3 = side_3;
    }

    @Override
    public double getArea() {
        double semiPerimeter = (side_1 + side_2 + side_3) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - side_1) * (semiPerimeter - side_2) * (semiPerimeter - side_3));
    }

    @Override
    public double getPerimeter() {
        return side_1 + side_2 + side_3;
    }
}
