package ecommerce.service;

import ecommerce.model.Product;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class ProductCatalog {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public List<Product> getAll() {
        return products;
    }

    public List<Product> filter(Predicate<Product> predicate) {
        return products.stream()
                .filter(predicate)
                .toList();
    }

    public List<Product> sortByPrice() {
        return products.stream()
                .sorted(Comparator.comparing(Product::getPrice))
                .toList();
    }
}
