package com.alvinodev.booktrack.models;

import com.alvinodev.booktrack.interfaces.Rateable;

public class Book extends Publication implements Rateable {
    private String genre;
    private double rating;

    public Book(String title, String author, int year, String genre, Double rating) {
        super(title, author, year);
        this.genre = genre;
        this.rating = rating;
    }

    @Override
    public int getRating() {
        return (int) Math.round(rating);
    }
}
