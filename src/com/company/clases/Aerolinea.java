package com.company.clases;

import java.util.Scanner;

public class Aerolinea {
    public static Vuelos[] VuelosRegisterList;
    private Pasajero[] PasajerosRegisterList;
    private Reserva[] ReservaRegisterList;

    public Aerolinea(){
        VuelosRegisterList = new Vuelos[10];
        PasajerosRegisterList = new Pasajero[40];
        ReservaRegisterList = new Reserva[40];
    }

    public static void crearPasajero() {
        crearPasajero();
    }


    public boolean VerificarPasajero(Pasajero pasajero){
        boolean idNotUse = false;
        for (int i = 0; i < PasajerosRegisterList.length; i++){
            if ( PasajerosRegisterList[i] != null ){
                if (pasajero.getId() == (PasajerosRegisterList[i].getId())){
                    idNotUse = true;
                    System.out.println("Esta ocupado");
                }
            }
        }
        return idNotUse;
    }

    public boolean VerficarReserva(Reserva reserva){
        boolean idNotUse = false;
        for (int i = 0; i < ReservaRegisterList.length; i++){
            if ( ReservaRegisterList[i] != null ){
                if (reserva.getIdReserva()== (ReservaRegisterList[i].getId())){
                    idNotUse = true;
                    System.out.println("La reserva esta ocupada");
                }
            }
        }
        return idNotUse;
    }

    public boolean VerificarVuelo(Vuelos vuelos){
        boolean idNotUse = false;
        for (int i = 0; i < VuelosRegisterList.length; i++){
            if ( VuelosRegisterList[i] != null ){
                if (vuelos.getIdVuelo() == (VuelosRegisterList[i].getIdVuelo())){
                    idNotUse = true;
                }
            }
        }
        return idNotUse;
    }

    public static Pasajero crearPasajero(int id, String nombre, Asientos asiento){
        Scanner sc = new Scanner(System.in);
        id++;
        System.out.println("Introduzca su nombre: ");
        nombre = sc.next();
        System.out.println("Introduzca el asiento que desea");
        Asientos asientos = asiento.VALUE;
        System.out.println("VALUE");
        System.out.println("REGULAR");
        System.out.println("PLUS");
        System.out.println("FLEXPLUS");
        switch (asientos){
            case VALUE -> asiento = asientos.VALUE;
            case REGULAR -> asiento = asientos.REGULAR;
            case PLUS -> asiento = asientos.PLUS;
            case FLEXIPLUS -> asiento = asientos.FLEXIPLUS;
        }
        return new Pasajero(id, nombre, asiento);
    }


    public Reserva crearReserva(int id, String nombre, Asientos asiento, boolean reservado, int idReserva){

        return new Reserva(id, nombre, asiento, reservado, idReserva);
    }

    public void registarPasajero(Pasajero pasajero){
        boolean idIsInUse = VerificarPasajero(pasajero);
        if (idIsInUse == true){
            System.out.println("El pasajero ya esta registrado");
        }
        for (int i = 0; i < PasajerosRegisterList.length; i++) {
            if (PasajerosRegisterList[i] == null) {
                PasajerosRegisterList[i] = pasajero;
                return;
            }
        }
    }

    public void registarReserva(Reserva reserva) throws Sugerencias{
        boolean idIsInUse = VerficarReserva(reserva);
        if (idIsInUse == true){
            throw new Sugerencias();
        }
        for (int i = 0; i < ReservaRegisterList.length; i++) {
            if (ReservaRegisterList[i] == null) {
                ReservaRegisterList[i] = reserva;
                return;
            }
        }
    }

}
