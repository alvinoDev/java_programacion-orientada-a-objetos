package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.models.Movie;
import com.aluracursos.screenmatch.models.Serie;
import com.aluracursos.screenmatch.models.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class PrincipalWithLists {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Encanto", 2021);
        myMovie.movieRating(9);

        Movie otherMovie = new Movie("Avatar", 2023);
        otherMovie.movieRating(7);

        var movieOfBruno = new Movie("El señor de los anillos", 2001);
        movieOfBruno.movieRating(9.5);

        Serie serieBruno = new Serie("Lost", 2000);

        ArrayList<Title> arrayList = new ArrayList<>();
        arrayList.add(myMovie);
        arrayList.add(otherMovie);
        arrayList.add(movieOfBruno);
        arrayList.add(serieBruno);

//        for( Title item : arrayList) {
//            System.out.println(item);
//        }

//        for( Title item : arrayList) {
//            System.out.println(item.getName());
//            if(item instanceof Movie) {
//                Movie movie = (Movie) item;
//                System.out.println(movie.getClassification());
//            }
//        }

//        for( Title item : arrayList) {
//            System.out.println(item.getName());
//            if(item instanceof Movie movie) {
//                System.out.println(movie.getClassification());
//            }
//        }

        for( Title item : arrayList) {
            System.out.println(item.getName());
            if(item instanceof Movie movie && movie.getClassification() > 3) {
                System.out.println(movie.getClassification());
            }
        }

        System.out.println("==================================================");
        ArrayList<String> artistList = new ArrayList<>();
        // List<String> artistList3 = new ArrayList<>();
        // List<String> artistList2 = new LinkedList<>();
        artistList.add("Penelope Cruz");
        artistList.add("Antonio Banderas");
        artistList.add("Ricardo Darain");
        System.out.println("Lista no Ordenada - letra: " + artistList);

        Collections.sort(artistList);
        System.out.println("Lista Ordenada - letra: " + artistList);

        Collections.sort(arrayList);
        System.out.println("Lista de Titulos Ordenada: " + arrayList);

        arrayList.sort(Comparator.comparing(Title::getReleaseDate));
        System.out.println("Lista de Titulos Ordenada - fecha: " + arrayList);

    }
}
