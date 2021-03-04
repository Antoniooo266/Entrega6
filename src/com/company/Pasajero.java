package com.company;

public class Pasajero extends Reserva{
    private String nombre;
    private Asientos asiento;

    public Pasajero(String salida, String llegada, int hora, int capacidad, String nombreAvion, String nombre, Asientos asiento) {
        super(salida, llegada, hora, capacidad, nombreAvion);
        this.nombre = nombre;
        this.asiento = asiento;
    }
}
