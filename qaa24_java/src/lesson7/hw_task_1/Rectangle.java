package lesson7.hw_task_1;

public class Rectangle extends Figure {
    private double a;
    private double b;
    private double c;
    private double d;

    public Rectangle(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double perimeter() {
        return a+b+c+d;
    }

    @Override
    public double area() {
        return a * b;
    }
}
