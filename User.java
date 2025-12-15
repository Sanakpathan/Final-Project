package ecommerce.model;

public abstract class User {
    private String userId;
    private String username;

    protected User(String userId, String username) {
        this.userId = userId;
        this.username = username;
    }

    public abstract String getRole();

    public String getUsername() { return username; }
}
