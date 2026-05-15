package Lesson4;

public class Triangle extends Figure {
    private final double sideA;

    private final double sideB;

    private final double sideC;

    public Triangle(double sideA, double sideB, double sideC, String borderColor, String backgroundColor) {
        super(borderColor, backgroundColor);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
}
