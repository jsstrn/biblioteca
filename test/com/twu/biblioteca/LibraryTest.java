package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;

    private PrintStream originalOutputStream;
    private PrintStream anotherOutputStream;
    private ByteArrayOutputStream testOutputStream;

    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void setUp () {
        library = new Library();
        originalOutputStream = System.out;
        testOutputStream = new ByteArrayOutputStream();
        anotherOutputStream = new PrintStream(testOutputStream);
        System.setOut(anotherOutputStream);

        book1 = new Book("Title 1", "James Tan", 1999);
        book2 = new Book("Title 2", "Alex Lim", 2001);
        book3 = new Book("Title 3", "Alfred Choo", 2015);
    }

    @Test
    public void shouldDisplayWelcomeMessage () {
        library.displayWelcomeMessage();
        assertEquals("Welcome to Biblioteca", testOutputStream.toString());
    }

    @Test
    public void shouldDisplayMenu () {
        library.displayMenu();
    }

    @Test
    public void shouldListBooks () {
        ArrayList<String> books = new ArrayList<String>();
        books.add("Book 1");
        books.add("Book 2");
        books.add("Book 3");
        books.add("Book 4");
        library.listAllBooks(books);
        StringBuilder expectedOutput = new StringBuilder();
        for (String book : books) {
            expectedOutput.append(book);
            expectedOutput.append("\n");
        }
        assertEquals(expectedOutput.toString(), testOutputStream.toString());
    }
    @Test
    public void shouldCheckoutBookIfAvailable() {

    }

    @After
    public void tearDown () {
        System.setOut(originalOutputStream);
    }
}
