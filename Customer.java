package ecommerce.model;

public class Customer extends User {
    private ShoppingCart cart = new ShoppingCart();

    public Customer(String id, String username) {
        super(id, username);
    }

    public ShoppingCart getCart() {
        return cart;
    }

    @Override
    public String getRole() {
        return "Customer";
    }
}
