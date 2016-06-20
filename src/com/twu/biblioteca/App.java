package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    private static Library library;
    private static ArrayList<Book> books;

    private static void createLibrary() {
        books = new ArrayList<Book>();
        Book book1 = new Book("Refactoring", "Martin Fowler", 1999);
        Book book2 = new Book("Design Patterns", "Gang of Four", 1994);
        Book book3 = new Book("Clean Code", "Robert Martin", 2008);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        library = new Library(books);
    }

    private static void loanBook() {
        int choice;
        System.out.println(library.listAllBooks());
        System.out.print("Select a book to loan: ");

        Scanner scan = new Scanner(System.in);
        choice = scan.nextInt();
        Book book = books.get(choice - 1);

        if (library.checkout(book)) {
            System.out.printf(
                    "You have successfully loaned %s by %s",
                    book.getTitle(),
                    book.getAuthor());
        } else {
            System.out.printf(
                    "You can't loan %s by %s because it's already on loan.",
                    book.getTitle(),
                    book.getAuthor());
        }
    }

    private static void returnBook() {
        int choice;

        System.out.println(library.listAllBooks());
        System.out.print("Select a book to return: ");

        Scanner scan = new Scanner(System.in);
        choice = scan.nextInt();
        Book book = books.get(choice - 1);

        if (library.checkin(book)) {
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

    private static void displayAllBooks() {
        System.out.println(library.listAllBooks());
    }

    public static void main (String[] args) {
        char choice = ' ';
        char quit = 'Q';
        createLibrary();
        library.displayWelcomeMessage();
        Scanner scan = new Scanner(System.in);
        while (choice != quit) {
            library.displayMenu();
            choice = scan.nextLine().charAt(0);
            System.out.println();
            switch (choice) {
                case '1':
                    displayAllBooks();
                    break;
                case '2':
                    loanBook();
                    break;
                case '3':
                    returnBook();
                    break;
                case 'q':
                case 'Q':
                    System.out.println("Thank you for using Biblioteca! Goodbye");
                default:
                    System.out.println("Invalid option\n");
                    break;
            }
            System.out.println();
        }

    }
}
