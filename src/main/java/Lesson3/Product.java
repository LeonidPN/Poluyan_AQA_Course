package Lesson3;

public class Product {
    private String name;

    private String manufactureDate;

    private String manufacturer;

    private String manufacturingCountry;

    private double price;

    private boolean onHold;

    public Product(String name, String manufactureDate, String manufacturer, String manufacturingCountry, double price, boolean onHold) {
        this.name = name;
        this.manufactureDate = manufactureDate;
        this.manufacturer = manufacturer;
        this.manufacturingCountry = manufacturingCountry;
        this.price = price;
        this.onHold = onHold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturingCountry() {
        return manufacturingCountry;
    }

    public void setManufacturingCountry(String manufacturingCountry) {
        this.manufacturingCountry = manufacturingCountry;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOnHold() {
        return onHold;
    }

    public void setOnHold(boolean onHold) {
        this.onHold = onHold;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", manufactureDate='" + manufactureDate + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", manufacturingCountry='" + manufacturingCountry + '\'' +
                ", price=" + price +
                ", onHold=" + onHold +
                '}';
    }

    public void PrintProductData() {
        System.out.println("Name: " + name);
        System.out.println("Manufacture date: " + manufactureDate);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Manufacturing country: " + manufacturingCountry);
        System.out.println("Price: " + price);
        System.out.println("On hold: " + (onHold ? "YES" : "NO"));
    }
}
