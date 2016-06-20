package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    private Book book;
    private String title;
    private String author;
    private int yearPublished;

    @Before
    public void setUp() {
        title = "The Great Gatsby";
        author = "F. Scott Fitzgerald";
        yearPublished = 1999;
        book = new Book(title, author, yearPublished);
    }

    @Test
    public void shouldCreateNewBook() throws Exception {
        assertEquals(title, book.getTitle());
        assertEquals(author, book.getAuthor());
        assertEquals(yearPublished, book.getYearPublished());
        assertFalse(book.isOnLoan());
    }

    @Test
    public void shouldSetLoanStatus() throws Exception {
        book.setOnLoan(true);
        assertEquals(true, book.isOnLoan());
    }
}