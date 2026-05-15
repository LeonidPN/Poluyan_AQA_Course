package Lesson4;

public class Dog extends Animal {
    private static int count;

    public Dog(String name) {
        super(name);
        count++;
        maxRunningDistance = 500;
        maxSwimmingDistance = 10;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void run(double distance) {
        if (distance > 0) {
            if (distance <= maxRunningDistance) {
                System.out.println(getName() + " is running for " + distance + " meters");
            } else {
                System.out.println("Dogs are not able to run for " + distance + " meters, so " + getName() + " stops at " + maxRunningDistance + " meters to rest");
            }
        } else {
            System.out.println("This dog is not able to comprehend your command");
        }
    }

    @Override
    public void swim(double distance) {
        if (distance > 0) {
            if (distance <= maxSwimmingDistance) {
                System.out.println(getName() + " is swimming for " + distance + " meters");
            } else {
                System.out.println("Dogs are not able to swim for " + distance + " meters, so " + getName() + " stops at " + maxSwimmingDistance + " meters and starts whimpering");
            }
        } else {
            System.out.println("This dog is not able to comprehend your command");
        }
    }
}
