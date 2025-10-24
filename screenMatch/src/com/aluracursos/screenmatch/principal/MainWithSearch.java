package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.exceptions.ErrorConvertionDurationMinutesException;
import com.aluracursos.screenmatch.models.Title;
import com.aluracursos.screenmatch.service.FileSaver;
import com.aluracursos.screenmatch.service.OmdbApiClient;
import com.aluracursos.screenmatch.service.TitleConverter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainWithSearch {
    static void main() throws IOException, InterruptedException {

        Scanner inputData = new Scanner(System.in);
        List<Title> titles = new ArrayList<>();

        // Instanciar los servicios
        OmdbApiClient apiClient = new OmdbApiClient();
        TitleConverter converter = new TitleConverter();
        FileSaver fileSaver = new FileSaver();

        while (true){
            System.out.print("Escribe el nombre de la pelicula (o 'salir'): ");
            String dataSearch = inputData.nextLine();

            if(dataSearch.equalsIgnoreCase("salir")){ break; }

            // Formatear la entrada para la URL de la API
            String formattedSearch = dataSearch.replace(" ", "+");

            try {
                // USAR SERVICIO: Obtener JSON de la API
                String movieJson = apiClient.searchTitle(formattedSearch);
                System.out.println("JSON crudo: " + movieJson);

                System.out.println("-----------------------------------------------");

                // Verificar si la película existe antes de intentar convertir
                if (movieJson.contains("\"Response\":\"False\"")) {
                    System.out.println("Título no encontrado en OMDB. Intente de nuevo.");
                    continue;
                }

                // USAR SERVICIO: Convertir JSON a objeto Title
                Title myTitle = converter.convertJsonToTitle(movieJson);
                System.out.println(" Título convertido: " + myTitle);
                titles.add(myTitle);

            } catch (NumberFormatException e) {
                System.out.println("Ocurrio un error en formato de número: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error en la URL o argumento: " + e.getMessage());
            } catch (ErrorConvertionDurationMinutesException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println("Error de I/O (Red o Archivo): " + e.getMessage());
            } catch (InterruptedException e) {
                System.out.println("La solicitud fue interrumpida: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: " + e.getMessage());
            }
        }

        // USAR SERVICIO: Guardar la lista en un archivo
        try {
            String titlesJson = converter.convertTitleListToJson(titles);
            fileSaver.saveToFile(titlesJson, "titles.json");
            System.out.println("\n Datos guardados exitosamente en 'titles.json'.");
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }

        System.out.println(" Ejecución del programa finalizado.");
        inputData.close();
    }
}
