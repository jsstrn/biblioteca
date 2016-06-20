package com.twu.biblioteca;

public class Book {

    private String title;
    private String author;
    private int yearPublished;
    private boolean onLoan;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public boolean isOnLoan() {
        return onLoan;
    }

    public void setOnLoan(boolean status) {
        this.onLoan = status;
    }

    public Book (String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.onLoan = false;
    }

    public String loanStatus() {
        return (this.isOnLoan()) ? "on loan" : "available";
    }
}
