void main() {
    //IO.println(String.format("Hello and welcome!"));
    System.out.println("Bienvenido (a) a SCREEN MATCH");
    System.out.println("Pelicula: Matrix");

    int fechaDeLanzamiento = 1999;
    boolean incluidoEnElPlan = true;
    double notaDeLaPelicula = 8.2;

    double media = (8.2 + 6.0 + 9.0) / 3;
    System.out.println("Media: " + media);

    String sinopsis = """
            Matrix es una paradoja
            La mejor pelicula del fin del milenio
            Fue lanzado en: %s
            Nota de la Pelicula: %s
            """.formatted(fechaDeLanzamiento, notaDeLaPelicula);
    System.out.println(sinopsis);

    int clasificacion = (int) (media/2);
    System.out.println("Clasificacion: " + clasificacion);
}
