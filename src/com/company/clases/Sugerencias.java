package com.company.clases;

public class Sugerencias extends Exception{

    public Sugerencias(){
        super("No quedan billetes para este vuelo" + "\n" + "Vuelos disponibles -> " + "\n");
        MostrarVuelos();
    }

    public String MostrarVuelos(){
        String VuelosRegistrados = "";
        for (int i = 0; i < Aerolinea.VuelosRegisterList.length; i++){
            if (Aerolinea.VuelosRegisterList[i] != null ){
                VuelosRegistrados += ("Vuelo Destino: " + Aerolinea.VuelosRegisterList[i].getLlegada() +"  Desde: " + Aerolinea.VuelosRegisterList[i].getSalida() + "\n");
            }
        }
        return VuelosRegistrados;
    }
}
