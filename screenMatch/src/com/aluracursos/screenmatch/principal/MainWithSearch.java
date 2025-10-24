package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.exceptions.ErrorConvertionDurationMinutesException;
import com.aluracursos.screenmatch.models.Title;
import com.aluracursos.screenmatch.models.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainWithSearch {
    static void main() throws IOException, InterruptedException {

        Scanner inputData = new Scanner(System.in);
        List<Title> titles = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (true){
            System.out.print("Escribe el nombre de la pelicula: ");
            String dataSearch = inputData.next().replace(" ", "+");

            if(dataSearch.equalsIgnoreCase("salir")){ break; }

            String url_omdbapi = "https://www.omdbapi.com/?t=" + dataSearch + "&apikey=34353774";

            try {
                HttpClient client = HttpClient.newHttpClient();

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url_omdbapi))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String movieJson = response.body();
                System.out.println(movieJson);

                System.out.println("-----------------------------------------------");

                TitleOmdb myTitleOmdb = gson.fromJson(movieJson, TitleOmdb.class);
                System.out.println(myTitleOmdb);

                Title myTitle = new Title(myTitleOmdb);
                System.out.println("Titulo convertido: " + myTitle);

                titles.add(myTitle);

            }catch (NumberFormatException e) {
                System.out.println("Ocurrio un error!");
                System.out.println(e.getMessage());
            }catch (IllegalArgumentException e) {
                System.out.println("Error en la URL, verifique la direccion!");
            }catch (ErrorConvertionDurationMinutesException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(titles);

        FileWriter writeTitle = new FileWriter("titles.json");
        writeTitle.write(gson.toJson(titles));
        writeTitle.close();
        System.out.println("Ejecucion del programa finalizado!");

    }
}
