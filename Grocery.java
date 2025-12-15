package ecommerce.model;

import java.time.LocalDate;

public class Grocery extends Product {
    private LocalDate expirationDate;

    public Grocery(String id, String name, double price, LocalDate expirationDate) {
        super(id, name, price);
        this.expirationDate = expirationDate;
    }

    @Override
    public String getCategory() {
        return "Grocery";
    }
}
