package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<Book>();
        Book book1 = new Book("Refactoring", "Martin Fowler", 1999);
        Book book2 = new Book("Design Patterns", "Gang of Four", 1994);
        Book book3 = new Book("Clean Code", "Robert Martin", 2008);
        this.books.add(book1);
        this.books.add(book2);
        this.books.add(book3);
    }
    public ArrayList<Book> getAllBooks() {
        return books;
    }

    public void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. List all books");
        System.out.println("2. Loan a book");
        System.out.println("3. Return a book");
        System.out.print("Select an option or type Q to quit: ");
    }

    public void displayWelcomeMessage() {
        System.out.println("Welcome to Biblioteca!\n");
    }

    public String listBook(Book book) {
        return String.format("%s by %s (%d) is %s%n",
                book.getTitle(),
                book.getAuthor(),
                book.getYearPublished(),
                book.loanStatus()
        );
    }

    public String listAllBooks() {
        int count = 0;
        StringBuilder output = new StringBuilder();
        for (Book book : books) {
            count++;
            output.append(this.listBook(book));
        }
        return output.toString();
    }

    public void loanBook() {
        int choice;

        listAllBooks();
        System.out.print("Select a book to loan: ");

        Scanner scan = new Scanner(System.in);
        choice = scan.nextInt();
        Book book = books.get(choice -1);

        if (!book.isOnLoan()) {
            book.setOnLoan(true);
            System.out.printf(
                    "You have successfully loaned %s by %s",
                    book.getTitle(),
                    book.getAuthor());
        } else {
            System.out.printf(
                    "%s by %s is already on loan",
                    book.getTitle(),
                    book.getAuthor());
        }
    }

    public void returnBook() {
        int choice;

        listAllBooks();
        System.out.print("Select a book to loan: ");

        Scanner scan = new Scanner(System.in);
        choice = scan.nextInt();
        Book book = books.get(choice -1);

        if (book.isOnLoan()) {
            book.setOnLoan(false);
            System.out.printf(
                    "You have successfully returned %s by %s",
                    book.getTitle(),
                    book.getAuthor());
        } else {
            System.out.printf(
                    "You can't return %s by %s because it's not on loan.",
                    book.getTitle(),
                    book.getAuthor());
        }
    }

    public boolean checkout(Book book) {
        if (!book.isOnLoan()) {
            book.setOnLoan(true);
            return true;
        } else {
            return false;
        }
    }

    public boolean checkin(Book book) {
        if (book.isOnLoan()) {
            book.setOnLoan(false);
            return true;
        } else {
            return false;
        }
    }
}
