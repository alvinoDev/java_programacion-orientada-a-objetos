import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class SearchMovieSW {
    public MovieStarWars searchMovie(int movie_id) {
        URI urlSwApi = URI.create("https://swapi.dev/api/films/" + movie_id);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(urlSwApi)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        return new Gson().fromJson(response.body(), MovieStarWars.class);

        } catch (Exception e) {
            throw new RuntimeException("Pelicula no encontrado");
        }

    }
}
