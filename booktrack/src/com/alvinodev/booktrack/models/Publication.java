package com.alvinodev.booktrack.models;

public abstract class Publication {
    private String title;
    private String author;
    private int year;

    public Publication(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }

    public void showInfo() {
        System.out.printf("📖 %s (%d) - %s%n", title, year, author);
    }
}
