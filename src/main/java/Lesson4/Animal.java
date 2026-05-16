package Lesson4;

public abstract class Animal {
    private String name;
    private final double maxRunningDistance;
    private final double maxSwimmingDistance;
    private static int count;

    public Animal(String name, double maxRunningDistance, double maxSwimmingDistance) {
        this.name = name;
        this.maxRunningDistance = maxRunningDistance;
        this.maxSwimmingDistance = maxSwimmingDistance;
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
        if (distance > 0) {
            if (distance <= maxRunningDistance) {
                System.out.println(name + " is running for " + distance + " meters");
            } else {
                System.out.println(name + " is not able to run for " + distance + " meters, so they stop at " + maxRunningDistance + " meters to rest");
            }
        } else {
            System.out.println(name + " is not able to comprehend your command");
        }
    }

    public void swim(double distance) {
        if (distance > 0) {
            if (distance <= maxSwimmingDistance) {
                System.out.println(name + " is swimming for " + distance + " meters");
            } else {
                System.out.println(name + " is not able to swim for " + distance + " meters, so they stop at " + maxSwimmingDistance + " meters and start drowning");
            }
        } else {
            System.out.println(name + " is not able to comprehend your command");
        }
    }
}
