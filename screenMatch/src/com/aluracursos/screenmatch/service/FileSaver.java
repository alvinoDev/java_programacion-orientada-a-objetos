package com.aluracursos.screenmatch.service;

import java.io.FileWriter;
import java.io.IOException;

public class FileSaver {

    public void saveToFile(String jsonContent, String fileName) throws IOException {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(jsonContent);
            // fileWriter.close() se maneja automáticamente con el try-with-resources
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
