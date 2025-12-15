package ecommerce.model;

import java.util.List;
import java.util.function.DoubleUnaryOperator;

public class Order {
    private Customer customer;
    private List<Product> items;

    private DoubleUnaryOperator discount;
    private DoubleUnaryOperator tax;
    private DoubleUnaryOperator shipping;

    public Order(Customer customer, List<Product> items,
                 DoubleUnaryOperator discount,
                 DoubleUnaryOperator tax,
                 DoubleUnaryOperator shipping) {
        this.customer = customer;
        this.items = items;
        this.discount = discount;
        this.tax = tax;
        this.shipping = shipping;
    }

    public double calculateSubtotal() {
        return items.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public double calculateTotal() {
        double subtotal = calculateSubtotal();
        subtotal = discount.applyAsDouble(subtotal);
        return subtotal + tax.applyAsDouble(subtotal) + shipping.applyAsDouble(subtotal);
    }

    @Override
    public String toString() {
        return "Order for " + customer.getUsername() +
                " | Items: " + items.size();
    }
}
