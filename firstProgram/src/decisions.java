void main() {
    int fechaDeLanzamiento = 1999;
    boolean incluidoEnElPlan = false;
    double notaDeLaPelicula = 8.2;

    String tipoPlan = "standard"; // plus

    if(fechaDeLanzamiento > 2022) {
        System.out.println("Peliculas mas populares");
    } else {
        System.out.println("Pelicula RETRO, vale la pena ver.");
    }

    if(incluidoEnElPlan || tipoPlan.equals("plus")) {
        System.out.println("Disfruta de la pelicula");
    } else {
        System.out.println("Pelicula no disponible en el Plan.");
    }
}
