package ecommerce.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> items = new ArrayList<>();

    public void add(Product product) {
        items.add(product);
    }

    public List<Product> getItems() {
        return items;
    }
}
