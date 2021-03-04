package com.company;

public class Reserva extends Avion{
    private boolean reservado;

    public Reserva(String salida, String llegada, int hora, int capacidad, String nombreAvion, boolean reservado) {
        super(salida, llegada, hora, capacidad, nombreAvion);
        this.reservado = reservado;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }
}
