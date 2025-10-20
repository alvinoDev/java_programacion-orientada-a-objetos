package com.aluracursos.screenmatch.models;

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
}
