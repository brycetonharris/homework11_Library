package library;

import library.items.*;
import library.users.*;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Item> items;
    private List<User> users;

    public Library() {
        items = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void showItems() {
        for (Item item : items) {
            item.printDetails();
        }
    }

    public void showUsers() {
        for (User user : users) {
            user.showDetails();
        }
    }
}