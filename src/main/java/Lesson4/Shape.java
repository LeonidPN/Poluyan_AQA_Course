package Lesson4;

public interface Shape {
    default double getArea() {
        System.out.println("Method is not implemented");
        return -1;
    }

    default double getPerimeter() {
        System.out.println("Method is not implemented");
        return -1;
    }
}
