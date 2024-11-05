package library.items;

import library.utils.Loanable;
import library.utils.Reservable;

public class Item extends AbstractItem implements Loanable, Reservable {
    private boolean isLoaned;
    private boolean isReserved;

    public Item(String title, String author) {
        super(title, author);
        this.isLoaned = false;
        this.isReserved = false;
    }

    public Item() {
        this("Default Title", "Default Author");
    }

    @Override
    public void loan() {
        this.isLoaned = true;
    }

    @Override
    public void returnItem() {
        this.isLoaned = false;
    }

    @Override
    public void reserve() {
        this.isReserved = true;
    }

    @Override
    public void printDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}