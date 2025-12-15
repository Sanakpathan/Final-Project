package ecommerce;

import ecommerce.model.*;
import ecommerce.service.*;

import java.time.LocalDate;
import java.util.function.DoubleUnaryOperator;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("C1", "Sana");
        Admin admin = new Admin("A1", "Admin");

        ProductCatalog catalog = new ProductCatalog();

        catalog.addProduct(new Electronics("P1", "Laptop", 800, 24));
        catalog.addProduct(new Clothing("P2", "Jacket", 60, "M"));
        catalog.addProduct(new Grocery("P3", "Milk", 4, LocalDate.now().plusDays(7)));

        System.out.println("All Products:");
        catalog.getAll().forEach(System.out::println);

        System.out.println("\nFiltered Electronics:");
        catalog.filter(p -> p.getCategory().equals("Electronics"))
               .forEach(System.out::println);

        customer.getCart().add(catalog.getAll().get(0));
        customer.getCart().add(catalog.getAll().get(1));

        DoubleUnaryOperator discount = total -> total * 0.9;
        DoubleUnaryOperator tax = total -> total * 0.08;
        DoubleUnaryOperator shipping = total -> total > 100 ? 0 : 10;

        Order order = new Order(
                customer,
                customer.getCart().getItems(),
                discount,
                tax,
                shipping
        );

        OrderService orderService = new OrderService();
        orderService.add(order);

        System.out.println("\nOrder Summary:");
        System.out.println(order);
        System.out.println("Total: $" + order.calculateTotal());
    }
}
