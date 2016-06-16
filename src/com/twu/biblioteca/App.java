package com.twu.biblioteca;

import com.javafx.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class App {
    private static Library library;

    public static void main (String[] args) {
        char choice = ' ';
        char quit = 'Q';
        library = new Library();
        library.displayWelcomeMessage();
        Scanner scan = new Scanner(System.in);
        while (choice != quit) {
            library.displayMenu();
            choice = scan.nextLine().charAt(0);
            switch (choice) {
                case '1':
                    library.listAllBooks();
                    break;
                case '2':
                    System.out.println("Choice 2\n");
                    break;
                case '3':
                    System.out.println("Choice 3\n");
                    break;
                case 'Q':
                    System.out.println("Thank you for using Biblioteca! Goodbye");
                default:
                    System.out.println("Invalid choice\n");
                    break;
            }
        }

    }
}
