package com.company.clases;

public class Reserva extends Pasajero{
    private int idReserva;

    public Reserva(int id, String nombre, Asientos asiento, int idReserva) {
        super(id, nombre, asiento);
        this.idReserva = idReserva;
    }

    public int getIdReserva() {
        return idReserva;
    }


}
