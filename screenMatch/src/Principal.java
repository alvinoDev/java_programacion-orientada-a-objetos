public class Principal {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        // System.out.println(myMovie); //Movie@8efb846
        myMovie.name = "Your Name";
        myMovie.releaseDate = 2016;
        myMovie.durationInMinutes = 150;

        myMovie.showTechnicalSpecifications();

        myMovie.movieRating(8);
        myMovie.movieRating(6);

        System.out.println("sumOfMovieRatings: " + myMovie.sumOfMovieRatings);
        System.out.println("numberOfRatings: " + myMovie.numberOfRatings);
        System.out.println("MEDIA: " + myMovie.calculateAverage());

//        Movie otherMovie = new Movie();
//
//        otherMovie.name = "El tiempo contigo";
//        otherMovie.releaseDate = 2019;
//        otherMovie.durationInMinutes = 154;
//
//        otherMovie.showTechnicalSpecifications();
//        System.out.println("MEDIA: " + otherMovie.calculateAverage());
    }
}
