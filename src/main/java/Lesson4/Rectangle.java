package Lesson4;

public class Rectangle extends Figure {
    private final double width;

    private final double length;

    public Rectangle(double width, double length, String borderColor, String backgroundColor) {
        super(borderColor, backgroundColor);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }
}
