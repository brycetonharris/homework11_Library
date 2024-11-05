package library;

import library.items.Book;
import library.items.DVD;
import library.users.Admin;
import library.users.Librarian;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Lightning Theif (2005)", "Rick Riordan", "1234567890");
        DVD dvd1 = new DVD("Star Wars: Episode III Revenge of the Sith (2005)", "George Lucas", "#1");

        Admin admin1 = new Admin("John Doe", "001", "ADM001");
        Librarian librarian1 = new Librarian("Jane Doe", "002", "Fiction");

        library.addItem(book1);
        library.addItem(dvd1);

        library.addUser(admin1);
        library.addUser(librarian1);

        library.showItems();
        library.showUsers();
    }
}