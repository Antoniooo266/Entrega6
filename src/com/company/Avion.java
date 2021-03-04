package com.company;

import java.util.Properties;

public class Avion extends Vuelos{
    private int capacidad = 40;
    private String nombreAvion;

    public Avion(String salida, String llegada, int hora, int capacidad, String nombreAvion) {
        super(salida, llegada, hora);
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
