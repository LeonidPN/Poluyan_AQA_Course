package Lesson4;

public class Cat extends Animal {
    private static int count;
    private boolean isHungry;

    public Cat(String name) {
        super(name, 200, 0);
        count++;
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
}
