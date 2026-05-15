package Lesson4;

public class Cat extends Animal {
    private static int count;

    private boolean isHungry;

    public Cat(String name) {
        super(name);
        count++;
        maxRunningDistance = 200;
        maxSwimmingDistance = 0;
        isHungry = true;
    }

    public static int getCount() {
        return count;
    }

    public void isCatHungry() {
        if (isHungry) {
            System.out.println(getName() + " is still hungry");
        } else {
            System.out.println(getName() + " is satiated");
        }
    }

    public void eat(int foodCount, Bowl bowl) {
        foodCount -= bowl.getFood(foodCount);
        if (foodCount == 0) {
            isHungry = false;
        }
    }

    @Override
    public void run(double distance) {
        if (distance > 0) {
            if (distance <= maxRunningDistance) {
                System.out.println(getName() + " is running for " + distance + " meters");
            } else {
                System.out.println("Cats are not able to run for " + distance + " meters, so " + getName() + " stops at " + maxRunningDistance + " meters to rest");
            }
        } else {
            System.out.println("This cat looks at you judgmentally");
        }
    }

    @Override
    public void swim(double distance) {
        if (distance > 0) {
            if (distance <= maxSwimmingDistance) {
                System.out.println(getName() + " is swimming for " + distance + " meters");
            } else {
                System.out.println("Cats are not able to swim for " + distance + " meters, so " + getName() + " stops at " + maxSwimmingDistance + " meters and starts drowning");
            }
        } else {
            System.out.println("This cat looks at you judgmentally");
        }
    }
}
