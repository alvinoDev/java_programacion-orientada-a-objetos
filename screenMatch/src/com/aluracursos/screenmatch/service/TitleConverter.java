package com.aluracursos.screenmatch.service;

import com.aluracursos.screenmatch.models.Title;
import com.aluracursos.screenmatch.models.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TitleConverter {
    private Gson gson;

    public TitleConverter() {
        this.gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
    }

    public Title convertJsonToTitle(String json) {
        TitleOmdb myTitleOmdb = gson.fromJson(json, TitleOmdb.class); // Convertir JSON a TitleOmdb (el DTO para la API)
        return new Title(myTitleOmdb); // Convertir TitleOmdb a Title (el modelo interno)
    }

    public String convertTitleListToJson(java.util.List<Title> titles) {
        return gson.toJson(titles);
    }
}
