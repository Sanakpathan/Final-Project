package ecommerce.service;

import ecommerce.model.Order;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrderService {
    private List<Order> orders = new ArrayList<>();

    public void add(Order order) {
        orders.add(order);
    }

    public List<Order> sortByTotal() {
        return orders.stream()
                .sorted(Comparator.comparing(Order::calculateTotal))
                .toList();
    }
}
