package com.company.clases;

public class Reserva extends Pasajero{
    private int idReserva;
    private boolean reservado;

    public Reserva(int id, String nombre, Asientos asiento, boolean reservado) {
        super(id, nombre, asiento);
        this.reservado = reservado;
    }


    public int getIdReserva() {
        return idReserva;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }


}
