package library.items;

public class Book extends Item {
    private String isbn;

    public Book(String title, String author, String isbn) {
        super(title, author);
        this.isbn = isbn;
    }

    public Book() {
        this("Default Book Title", "Default Book Author", "0000000000");
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("ISBN: " + isbn);
    }
}