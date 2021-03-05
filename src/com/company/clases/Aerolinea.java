package com.company.clases;

public class Aerolinea {
    private Vuelos[] VuelosRegisterList;
    private Pasajero[] PasajerosRegisterList;
    private Reserva[] ReservaRegisterList;

    public Aerolinea(){
        VuelosRegisterList = new Vuelos[10];
        PasajerosRegisterList = new Pasajero[40];
        ReservaRegisterList = new Reserva[40];
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

    public Pasajero crearPasajero(int id, String nombre, Asientos asiento){
        return new Pasajero(id, nombre, asiento);
    }

    public Vuelos crearVuelos(String salida, String llegada, int hora, int idVuelo){
        return new Vuelos(salida, llegada, hora, idVuelo);
    }

    public Reserva crearReserva(int id, String nombre, Asientos asiento, boolean reservado){
        return new Reserva(id, nombre, asiento, reservado);
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

    public void registarReserva(Reserva reserva){
        boolean idIsInUse = VerficarReserva(reserva);
        if (idIsInUse == true){
            System.out.println("La reserva ya esta comprada");
        }
        for (int i = 0; i < ReservaRegisterList.length; i++) {
            if (ReservaRegisterList[i] == null) {
                ReservaRegisterList[i] = reserva;
                return;
            }
        }
    }

}
