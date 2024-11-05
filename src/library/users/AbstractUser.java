package library.users;

public abstract class AbstractUser {
    protected String name;
    protected String userID;

    public AbstractUser(String name, String userID) {
        this.name = name;
        this.userID = userID;
    }

    public AbstractUser() {
        this("Unknown Name", "Unknown ID");
    }

    public abstract void showDetails();

    public void updateDetails(String name, String userID) {
        this.name = name;
        this.userID = userID;
    }
}