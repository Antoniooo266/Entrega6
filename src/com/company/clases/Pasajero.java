package com.company.clases;

public class Pasajero{
    private int id;
    private String nombre;
    private Asientos asiento;

    public Pasajero(int id, String nombre, Asientos asiento) {
        this.id = id;
        this.nombre = nombre;
        this.asiento = asiento;
    }

    public int getId() {
        return id;
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
