package com.aluracursos.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainWithSearch {
    static void main() throws IOException, InterruptedException {

        Scanner inputData = new Scanner(System.in);
        System.out.print("Escribe el nombre de la pelicula: ");

        String dataSearch = inputData.next();
        String url_omdbapi = "https://www.omdbapi.com/?t=" + dataSearch + "&apikey=34353774";


        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url_omdbapi))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
