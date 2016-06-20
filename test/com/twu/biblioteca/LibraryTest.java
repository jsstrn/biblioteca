package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private ArrayList<Book> books;

    private PrintStream originalOutputStream;
    private InputStream originalInputStream;
    private ByteArrayOutputStream testOutputStream;
    private ByteArrayInputStream testInputStream;

    private void setInputString(String input) {
        testInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(testInputStream);
    }

    @Before
    public void setUp() {
        books = new ArrayList<Book>();
        Book book1 = new Book("Refactoring", "Martin Fowler", 1999);
        Book book2 = new Book("Design Patterns", "Gang of Four", 1994);
        Book book3 = new Book("Clean Code", "Robert Martin", 2008);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        library = new Library(books);
        books = library.getAllBooks();
        originalOutputStream = System.out;
        originalInputStream = System.in;
        testOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOutputStream));
    }
    @Test
    public void shouldDisplayWelcomeMessage() {
        library.displayWelcomeMessage();
        assertEquals("Welcome to Biblioteca!\n\n", testOutputStream.toString());
    }
    @Test
    public void shouldCheckoutBook() {
        Book book = books.get(0);
        assertEquals(true, library.checkout(book));
    }
    @Test
    public void shouldNotCheckoutBook() {
        Book book = books.get(0);
        library.checkout(book);
        assertEquals(false, library.checkout(book));
    }
    @Test
    public void shouldCheckinBook() {
        Book book = books.get(0);
        library.checkout(book);
        assertEquals(true, library.checkin(book));
    }
    @Test
    public void shouldListBook() throws Exception {
        Book book = new Book("My Title", "My Author", 1999);
        String expectedOutput = String.format("%s by %s (%d) is %s%n",
                book.getTitle(),
                book.getAuthor(),
                book.getYearPublished(),
                book.loanStatus()
        );
        assertEquals(expectedOutput, library.listBook(book));
    }
    @Test
    public void shouldListAllBooks() throws Exception {
        StringBuilder expectedOutput = new StringBuilder();
        int count = 0;
        for (Book book : books) {
            count++;
            expectedOutput.append(library.listBook(book));
            expectedOutput.insert(0, ") ");
            expectedOutput.insert(0, count);
        }
        assertEquals(expectedOutput.toString(), library.listAllBooks());
    }
    @After
    public void tearDown () {
        System.setOut(originalOutputStream);
        System.setIn(originalInputStream);
    }
}
