package com.alvinodev.booktrack.services;

import com.alvinodev.booktrack.interfaces.Rateable;

public class RecommendationFilter {
    public void filter(Rateable item) {
        int rating = item.getRating();

        if(rating >= 4) {
            System.out.println("🌟 Recomendado: ¡Excelente elección!");
        } else if (rating == 3) {
            System.out.println("👍 Bueno para leer un fin de semana.");
        } else {
            System.out.println("📚 Guárdalo para más adelante.");
        }
    }
}
