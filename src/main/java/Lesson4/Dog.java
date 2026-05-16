package Lesson4;

public class Dog extends Animal {
    private static int count;

    public Dog(String name) {
        super(name, 500, 10);
        count++;
    }

    public static int getCount() {
        return count;
    }
}
