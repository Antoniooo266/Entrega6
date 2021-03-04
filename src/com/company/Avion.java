package com.company;

public class Avion extends Vuelos{
    private int capacidad;
    private String nombreAvion;

    public Avion(String salida, String llegada, int hora, int capacidad, String nombreAvion) {
        super(salida, llegada, hora);
        this.capacidad = capacidad;
        this.nombreAvion = nombreAvion;
    }
}
