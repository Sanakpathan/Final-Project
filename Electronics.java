package ecommerce.model;

public class Electronics extends Product {
    private int warrantyMonths;

    public Electronics(String id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String getCategory() {
        return "Electronics";
    }
}
