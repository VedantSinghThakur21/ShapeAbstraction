import java.lang.*;
class Triangle extends Shape {
    private double base, height;
    public Triangle(double base, double height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }
    public double calculateArea() {
        return 0.5 * base * height;
    }
    public double calculatePerimeter() {

    }
}

