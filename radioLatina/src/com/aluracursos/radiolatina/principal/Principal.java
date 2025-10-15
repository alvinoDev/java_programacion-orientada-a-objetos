package com.aluracursos.radiolatina.principal;

import com.aluracursos.radiolatina.models.Cancion;
import com.aluracursos.radiolatina.models.MisFavoritos;
import com.aluracursos.radiolatina.models.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Hala Madrid... Y Nada Más");
        miCancion.setCantante("Real Madrid");

        for (int i = 0; i < 120; i++) {
            miCancion.meGusta();
        }

        for (int i = 0; i < 500; i++) {
            miCancion.reproduce();
        }

        System.out.println("REPRODUCCIONES: " + miCancion.getTotalReproducciones());
        System.out.println("ME GUSTA: " + miCancion.getTotalMegusta());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicione(miCancion);

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriel Aguilar");
        miPodcast.setTitulo("Cafe Tech");

        for (int i = 0; i < 40; i++) {
            miPodcast.meGusta();
        }

        for (int i = 0; i < 250; i++) {
            miPodcast.reproduce();
        }
        System.out.println("REPRODUCCIONES: " + miPodcast.getTotalReproducciones());
        System.out.println("ME GUSTA: " + miPodcast.getTotalMegusta());
        favoritos.adicione(miPodcast);

    }
}
