package com.company;

public class Pasajero extends Reserva{
    private String nombre;
    private Asientos asiento;

    public Pasajero(String salida, String llegada, int hora, int capacidad, String nombreAvion, boolean reservado) {
        super(salida, llegada, hora, capacidad, nombreAvion, reservado);
    }

    public String getNombre() {
        return nombre;
    }

    public Asientos getAsiento() {
        return asiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAsiento(Asientos asiento) {
        this.asiento = asiento;
    }
}
