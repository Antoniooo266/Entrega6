package com.company;

public class Vuelos {
    private String salida;
    private String llegada;
    private int hora;

    public Vuelos(String salida, String llegada, int hora) {
        this.salida = salida;
        this.llegada = llegada;
        this.hora = hora;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getLlegada() {
        return llegada;
    }

    public void setLlegada(String llegada) {
        this.llegada = llegada;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
}
