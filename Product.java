package ecommerce.model;

public abstract class Product {
    private String id;
    private String name;
    private double price;

    protected Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public abstract String getCategory();

    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "[" + getCategory() + "] " + name + " ($" + price + ")";
    }
}
