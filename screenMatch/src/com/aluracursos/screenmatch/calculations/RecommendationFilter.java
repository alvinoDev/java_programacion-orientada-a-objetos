package com.aluracursos.screenmatch.calculations;

public class RecommendationFilter {
    public void filter(Classification classification) {
        if(classification.getClassification() >= 4) {
            System.out.println("    ║ MENSAJE: El mejor evaluado del momento");
        } else if (classification.getClassification() >= 2) {
            System.out.println("    ║ MENSAJE: Popular en este momento");
        } else {
            System.out.println("    ║ MENSAJE: Colocalo en tu lista para verlo mas tarde");
        }
    }
}
