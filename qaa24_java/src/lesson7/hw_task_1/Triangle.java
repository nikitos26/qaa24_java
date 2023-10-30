package lesson7.hw_task_1;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public double perimeter() {
        return  a + b + c;
    }

    @Override
    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt((s - a) * (s - b) * (s - c));
    }

}
