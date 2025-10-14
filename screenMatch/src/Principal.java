import com.aluracursos.screenmatch.calculations.TimeCalculator;
import com.aluracursos.screenmatch.models.Movie;
import com.aluracursos.screenmatch.models.Serie;

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

        System.out.println("    ║ MEDIA: " + myMovie.calculateAverage() + " (" + myMovie.totalOfRatings() + ")");

        TimeCalculator timeCalculator1 = new TimeCalculator();
        timeCalculator1.addTime(myMovie);

        System.out.println("    ║ TIEMPO TOTAL PELICULA: " + timeCalculator1.getTotalTime());

        Serie mySerie = new Serie();
        mySerie.setName("The Theory Big Bang");
        mySerie.setReleaseDate(2007);
        mySerie.setSeasons(12);
        mySerie.setMinutesEpisode(23);
        mySerie.setEpisodesSeason(24);

        mySerie.showTechnicalSpecifications();

        System.out.println("    ║ DURACION: " + mySerie.getDurationInMinutes());

        TimeCalculator timeCalculator2 = new TimeCalculator();
        timeCalculator2.addTime(mySerie);

        System.out.println("    ║ TIEMPO TOTAL PELICULA: " + timeCalculator2.getTotalTime());
    }
}
