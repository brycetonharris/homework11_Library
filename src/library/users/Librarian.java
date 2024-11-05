package library.users;

public class Librarian extends User {
    private String librarySection;

    public Librarian(String name, String userID, String librarySection) {
        super(name, userID);
        this.librarySection = librarySection;
    }

    public Librarian() {
        this("Default Librarian Name", "0000", "General Section");
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Library Section: " + librarySection);
    }
}