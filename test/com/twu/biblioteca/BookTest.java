package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    @Test
    public void shouldCreateNewBook() throws Exception {
        String title = "The Great Gatsby";
        String author = "F. Scott Fitzgerald";
        int yearPublished = 1999;
        Book book = new Book(title, author, yearPublished);
        assertEquals(title, book.getTitle());
        assertEquals(author, book.getAuthor());
        assertEquals(yearPublished, book.getYearPublished());
        assertFalse(book.isOnLoan());
    }
}