package Tasks.FirstTask;

public class Rectangle extends Shape{
    double height;
    double length;

    public Rectangle(double height, double length) {
        this.height = height;
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + height);
    }
}
