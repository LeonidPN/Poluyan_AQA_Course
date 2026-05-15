package Lesson4;

public abstract class Animal {
    private String name;

    protected double maxRunningDistance;

    protected double maxSwimmingDistance;

    private static int count;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public void run(double distance) {
        System.out.println("Animal is running for " + distance + " meters");
    }

    public void swim(double distance) {
        System.out.println("Animal is swimming for " + distance + " meters");
    }
}
