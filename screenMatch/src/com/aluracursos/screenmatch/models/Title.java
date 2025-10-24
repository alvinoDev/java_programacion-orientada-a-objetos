package com.aluracursos.screenmatch.models;

import com.aluracursos.screenmatch.exceptions.ErrorConvertionDurationMinutesException;
import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title> {
    public String name;
    private int releaseDate;
    private int durationInMinutes;
    private boolean includedInPlan;
    private double sumOfMovieRatings;
    private int numberOfRatings = 0;

    public Title(String name, int releaseDate) {
        this.name = name;
        this.releaseDate = releaseDate;
    }

    public Title(TitleOmdb myTitleOmdb) {
        this.name = myTitleOmdb.title();
        this.releaseDate = Integer.valueOf(myTitleOmdb.year());

        if(myTitleOmdb.runtime().contains("N/A")) {
            throw new ErrorConvertionDurationMinutesException("No se puede convetir la duracion, por que contiene un 'N/A'" );
        }
        this.durationInMinutes = Integer.valueOf( myTitleOmdb.runtime().substring(0,3).replace(" ", "") );
    }

    public String getName() {
        return name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public boolean isIncludedInPlan() {
        return includedInPlan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public int totalOfRatings(){
        return numberOfRatings;
    }

    public void movieRating(double rating) {
        sumOfMovieRatings += rating;
        numberOfRatings ++;
    }

    public double calculateAverage(){
        return sumOfMovieRatings / numberOfRatings;
    }

    public void showTechnicalSpecifications() {
        String message = """
            \n
            ╔═════════════════════════════════════════════════════
            ║                  🎞️ MY MOVIE 🎞️                     
            ╠═════════════════════════════════════════════════════
            ║ PELICUA: %s
            ║ FECHA DE LANZAMIENTO: %s
            ║ DURACION: %s
        """.formatted(name, releaseDate, getDurationInMinutes());
        System.out.println(message);
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }

    @Override
    public String toString() {
        return "{" +
                "name: " + name +
                ", releaseDate: " + releaseDate +
                ", durationInMinutes: " + durationInMinutes +
                '}';
    }
}
