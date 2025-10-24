import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class FileGenerator {
    public void saveJson(MovieStarWars movie) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        FileWriter writerFile = new FileWriter(movie.title() + ".json");
        writerFile.write(gson.toJson(movie));
        writerFile.close();
    }
}
