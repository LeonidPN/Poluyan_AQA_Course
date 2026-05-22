package Lesson4;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Scratch");
        dog.run(456);
        dog.run(688);
        dog.swim(6.6);
        dog.swim(12);
        System.out.println();

        Animal cat = new Cat("Charly");
        cat.run(143);
        cat.run(255);
        cat.swim(1);
        cat.run(-3);
        System.out.println();

        Bowl bowl = new Bowl(100);
        bowl.addFood(150);
        Animal[] cats = new Cat[4];
        cats[0] = new Cat("Alpha");
        cats[1] = new Cat("Betta");
        cats[2] = new Cat("Gamma");
        cats[3] = new Cat("Delta");
        ((Cat) cats[0]).eat(50, bowl);
        ((Cat) cats[1]).eat(30, bowl);
        ((Cat) cats[2]).eat(30, bowl);
        ((Cat) cats[3]).eat(10, bowl);
        for (Animal kitten : cats) {
            ((Cat) kitten).isCatHungry();
        }
        System.out.println();

        System.out.println(Animal.getCount());
        System.out.println(Dog.getCount());
        System.out.println(Cat.getCount());
        System.out.println();

        Figure[] figures = new Figure[3];
        figures[0] = new Circle(4, "RED", "YELLOW");
        figures[1] = new Rectangle(5, 8, "GREEN", "WHITE");
        figures[2] = new Triangle(15, 12, 9, "BLACK", "BLUE");

        for (Figure figure : figures) {
            System.out.printf("Area: %.2f\tPerimeter: %.2f\tBorder color: %s\tBackground color: %s",
                    figure.getArea(), figure.getPerimeter(), figure.getBorderColor(), figure.getBackgroundColor());
            System.out.println();
        }
    }
}
