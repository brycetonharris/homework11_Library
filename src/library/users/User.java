package library.users;

public class User extends AbstractUser {
    private int borrowedItems;

    public User(String name, String userID) {
        super(name, userID);
        this.borrowedItems = 0;
    }

    public User() {
        this("Default User Name", "0000");
    }

    @Override
    public void showDetails() {
        System.out.println("Name: " + name + ", User ID: " + userID);
    }

    public void borrowItem() {
        borrowedItems++;
    }
}