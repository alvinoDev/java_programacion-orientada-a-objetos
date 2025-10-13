import com.aluracursos.screenmatch.models.Movie;

public class Principal {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        // System.out.println(myMovie); //com.aluracursos.screenmatch.models.Movie@8efb846
        myMovie.setName("Your Name");
        myMovie.setReleaseDate(2016);
        myMovie.setDurationInMinutes(150);
        myMovie.setIncludedInPlan(true);

        myMovie.showTechnicalSpecifications();

        myMovie.movieRating(8);
        myMovie.movieRating(6);
        myMovie.movieRating(10);

        System.out.println("totalOfRatings: " + myMovie.totalOfRatings());
        System.out.println("MEDIA: " + myMovie.calculateAverage());
    }
}
