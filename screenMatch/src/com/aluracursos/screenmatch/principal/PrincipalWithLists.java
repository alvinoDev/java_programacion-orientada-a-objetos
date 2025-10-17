package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.models.Movie;
import com.aluracursos.screenmatch.models.Serie;
import com.aluracursos.screenmatch.models.Title;

import java.util.ArrayList;

public class PrincipalWithLists {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Encanto", 2021);
        myMovie.movieRating(9);

        Movie otherMovie = new Movie("Avatar", 2023);
        otherMovie.movieRating(7);

        var movieOfBruno = new Movie("el señor de los anillos", 2001);
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
    }
}
