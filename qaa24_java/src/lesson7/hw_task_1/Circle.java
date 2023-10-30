package lesson7.hw_task_1;

public class Circle extends Figure {
    private double p = 3.14;
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double perimeter() {
        return  2 * p * r;
    }

    @Override
    public double area() {
        return p * (r * r);
    }
}
