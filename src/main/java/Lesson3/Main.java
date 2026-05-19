package Lesson3;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.",
                "Korea", 499.99, true);
        products[1] = new Product("Souria 43 inches Smart TV", "02.03.2026", "Souria",
                "Mainland China", 1444.65, false);
        products[2] = new Product("Apple AirPods Pro (3nd Generation)", "15.12.2025", "Apple",
                "China", 197.9, true);
        products[3] = new Product("Samsung Galaxy Buds 4 Pro (2026)", "01.02.2026", "Samsung Corp.",
                "Korea", 249.99, false);
        products[4] = new Product("Apple AirTag (2nd Generation)", "21.06.2025", "Apple",
                "China", 29, true);

        for (Product product : products) {
            product.PrintProductData();
            System.out.println();
        }

        Park park = new Park("Park pobedy",
                new Park.Attraction[]{
                        new Park().new Attraction("Ferris wheel", "09:00", "17:00", 200),
                        new Park().new Attraction("Haunted house", "10:00", "16:00", 500)
        });

        System.out.println(park);
    }
}
