package com.alvinodev.booktrack.models;

import com.alvinodev.booktrack.interfaces.Rateable;

public class Magazine extends Publication implements Rateable {
    private int issueNumber;
    private double popularityScore;

    public Magazine(String title, String author, int year, int issueNumber, double popularityScore) {
        super(title, author, year);
        this.issueNumber = issueNumber;
        this.popularityScore = popularityScore;
    }

    @Override
    public int getRating() {
        return (int) popularityScore / 2;
    }
}
