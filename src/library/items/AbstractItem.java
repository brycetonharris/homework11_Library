package library.items;

public abstract class AbstractItem {
    protected String title;
    protected String author;

    public AbstractItem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public AbstractItem() {
        this("Unknown Title", "Unknown Author");
    }

    public abstract void printDetails();

    public void updateDetails(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
