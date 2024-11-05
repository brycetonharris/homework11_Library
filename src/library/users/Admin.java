package library.users;

public class Admin extends User {
    private String adminCode;

    public Admin(String name, String userID, String adminCode) {
        super(name, userID);
        this.adminCode = adminCode;
    }

    public Admin() {
        this("Default Admin Name", "0000", "ADMIN001");
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Admin Code: " + adminCode);
    }
}