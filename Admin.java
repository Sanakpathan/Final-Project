package ecommerce.model;

public class Admin extends User {

    public Admin(String id, String username) {
        super(id, username);
    }

    @Override
    public String getRole() {
        return "Admin";
    }
}
