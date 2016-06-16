package com.twu.biblioteca;

import javax.swing.*;
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    private void createListOfBooks() {
        Book book1 = new Book("Title 1", "Author 1", 2001);
        Book book2 = new Book("Title 2", "Author 2", 2002);
        Book book3 = new Book("Title 3", "Author 3", 2003);
        books.add(book1);
        books.add(book2);
        books.add(book3);
    }

    public void displayMenu() {
        System.out.println("Select an option:");
        System.out.println("1. List all books");
        System.out.println("2. Loan a book");
        System.out.println("3. Return a book");
        System.out.println("Type Q to quit");
        System.out.println();
    }

    public void displayWelcomeMessage() {
        System.out.println("Welcome to Biblioteca!\n");
    }

    public void listAllBooks(ArrayList<String> books) {
        for (String book : books) {
            System.out.print(book + "\n");
        }
    }

    public void listAllBooks() {
    }
}
