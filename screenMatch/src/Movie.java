public class Movie {
    String name;
    int releaseDate;
    int durationInMinutes;
    boolean includedInPlan;
    double sumOfMovieRatings;
    int numberOfRatings = 0;

    void showTechnicalSpecifications() {
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

    void movieRating(double rating) {
        sumOfMovieRatings += rating;
        numberOfRatings ++;
    }

    double calculateAverage(){
        return sumOfMovieRatings / numberOfRatings;
    }
}