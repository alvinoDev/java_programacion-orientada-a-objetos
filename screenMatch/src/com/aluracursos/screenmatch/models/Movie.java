package com.aluracursos.screenmatch.models;

public class Movie {
    public String name;
    private int releaseDate;
    private int durationInMinutes;
    private boolean includedInPlan;
    private double sumOfMovieRatings;
    private int numberOfRatings = 0;

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

    public void showTechnicalSpecifications() {
        String message = """
            ╔═════════════════════════════════════════════════════
            ║                  🎞️ MY MOVIE 🎞️                     
            ╠═════════════════════════════════════════════════════
            ║ PELICUA: %s
            ║ FECHA DE LANZAMIENTO: %s
            ║ DURACION: %s
            ╚═════════════════════════════════════════════════════\n
        """.formatted(name, releaseDate, durationInMinutes);
        System.out.println(message);
    }

    public void movieRating(double rating) {
        sumOfMovieRatings += rating;
        numberOfRatings ++;
    }

    public double calculateAverage(){
        return sumOfMovieRatings / numberOfRatings;
    }
}