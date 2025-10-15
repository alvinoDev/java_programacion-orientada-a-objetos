import com.aluracursos.screenmatch.calculations.RecommendationFilter;
import com.aluracursos.screenmatch.calculations.TimeCalculator;
import com.aluracursos.screenmatch.models.Episode;
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

        RecommendationFilter recommendationFilter = new RecommendationFilter();
        recommendationFilter.filter(myMovie);

        Serie theTheoryBigBang = new Serie();
        theTheoryBigBang.setName("The Theory Big Bang");
        theTheoryBigBang.setReleaseDate(2007);
        theTheoryBigBang.setSeasons(12);
        theTheoryBigBang.setMinutesEpisode(23);
        theTheoryBigBang.setEpisodesSeason(24);

        theTheoryBigBang.showTechnicalSpecifications();

        System.out.println("    ║ DURACION: " + theTheoryBigBang.getDurationInMinutes());

        TimeCalculator timeCalculator2 = new TimeCalculator();
        timeCalculator2.addTime(theTheoryBigBang);

        System.out.println("    ║ TIEMPO TOTAL SERIE: " + timeCalculator2.getTotalTime());

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setName("Piloto");
        episode.setSerie(theTheoryBigBang);
        episode.setTotalViews(799);

        recommendationFilter.filter(episode);
    }
}
