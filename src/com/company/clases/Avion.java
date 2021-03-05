package com.company.clases;


public class Avion{
    private int capacidad = 40;
    private String nombreAvion;

    public Avion(int capacidad, String nombreAvion) {
        this.capacidad = capacidad;
        this.nombreAvion = nombreAvion;
    }

    public String getNombreAvion() {
        return nombreAvion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setNombreAvion(String nombreAvion) {
        this.nombreAvion = nombreAvion;
    }
}
