package ecommerce.model;

public class Clothing extends Product {
    private String size;

    public Clothing(String id, String name, double price, String size) {
        super(id, name, price);
        this.size = size;
    }

    @Override
    public String getCategory() {
        return "Clothing";
    }
}
