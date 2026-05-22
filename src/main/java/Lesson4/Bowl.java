package Lesson4;

public class Bowl {
    private final int capacity;
    private int foodCount;

    public Bowl(int capacity) {
        this.capacity = capacity;
    }

    public int getFoodCount() {
        return foodCount;
    }

    public int getFood(int foodCount) {
        if (this.foodCount >= foodCount) {
            this.foodCount -= foodCount;
        } else {
            foodCount = this.foodCount;
            this.foodCount = 0;
        }
        return foodCount;
    }

    public void addFood(int foodCount) {
        if (this.foodCount + foodCount > capacity) {
            this.foodCount = capacity;
        } else {
            this.foodCount += foodCount;
        }
    }
}
