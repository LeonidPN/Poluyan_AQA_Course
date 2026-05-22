package Lesson4;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius, String borderColor, String backgroundColor) {
        super(borderColor, backgroundColor);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
