package com.aluracursos.radiolatina.models;

public class Audio {
    private String titulo;
    private int totalReproducciones;
    private int totalMegusta;
    private int clasificacion;

    public void meGusta() {
        this.totalMegusta++;
    }

    public void reproduce() {
        this.totalReproducciones++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducciones() {
        return totalReproducciones;
    }

    public void setTotalReproducciones(int totalReproducciones) {
        this.totalReproducciones = totalReproducciones;
    }

    public int getTotalMegusta() {
        return totalMegusta;
    }

    public void setTotalMegusta(int totalMegusta) {
        this.totalMegusta = totalMegusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}
