package com.company.clases;


public class ErrorReserva extends Exception{

    public ErrorReserva(){
        super("No quedan billetes para este vuelo" + "\n" + "Vuelos disponibles -> ");

    }

    public String  showFlightsGenerated(){
        String VuelosRegistrados = "";
        for (int i = 0; i < Vu.length; i++){

        }
        return VuelosRegistrados;
    }
}
