package com.twu.biblioteca;

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
            System.out.println();
            switch (choice) {
                case '1':
                    library.listAllBooks();
                    break;
                case '2':
                    library.loanBook();
                    break;
                case '3':
                    library.returnBook();
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
