import com.aluracursos.screenmatch.models.Serie;
import com.aluracursos.screenmatch.models.Title;

public class Principal {
    public static void main(String[] args) {
        Title myMovie = new Title();
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

        Serie mySerie = new Serie();
        mySerie.setName("The Theory Big Bang");
        mySerie.setReleaseDate(2007);
        mySerie.setSeasons(12);
        mySerie.setMinutesEpisode(23);
        mySerie.setEpisodesSeason(24);

        mySerie.showTechnicalSpecifications();

        System.out.println("    ║ DURACION: " + mySerie.getDurationInMinutes());
    }
}
