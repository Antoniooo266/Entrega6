package com.company.clases;


public class Aerolinea {
    public static Vuelos[] VuelosRegisterList;
    private Reserva[] ReservaRegisterList;

    public Aerolinea(){
        VuelosRegisterList = new Vuelos[10];
        ReservaRegisterList = new Reserva[40];
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
