import java.util.Scanner;

void main() {
    Scanner inputData = new Scanner(System.in);

    System.out.println("Escribe el nombre de tu pelicula favorita: ");
    String movie = inputData.nextLine();

    System.out.println("Escribe la fecha de lanzamiento: ");
    String releaseDate = inputData.nextLine();

    System.out.println("Escribe la tu nota para esta pelicula: ");
    double movieReview = inputData.nextDouble();

    String message = """
            ------------------------ \n
            PELICULA: %s
            FECHA DE LANZAMIENTO: %s
            NOTA: %s
            """.formatted(movie, releaseDate, movieReview);
    System.out.println(message);
}

