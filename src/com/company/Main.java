package com.company;
import com.company.clases.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Sugerencias {
        Aerolinea aerolinea = new Aerolinea();
        Vuelos vuelo = new Vuelos("Carolina", "Bogota", 11, 1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a Aerolineas ACR");
        System.out.println("Rellena todos los datos para realizar tu reserva");
        System.out.println("Introduzca su nombre: ");
        String nombre = sc.next();
        int id = 0;
        id++;
        System.out.println("Introduzca el asiento que desea");
        Asientos asiento;
        Asientos asientos = Asientos.VALUE;
        System.out.println("VALUE");
        System.out.println("REGULAR");
        System.out.println("PLUS");
        System.out.println("FLEXPLUS");
        switch (asientos){
            case VALUE -> {
                asiento = asientos.VALUE;
                break;
            }
            case REGULAR -> {
                asiento = Asientos.REGULAR;
                break;
            }
            case PLUS -> {
                asiento = asientos.PLUS;
                break;
            }
            case FLEXIPLUS -> {
                asiento = asientos.FLEXIPLUS;
                break;
            }
            default -> throw new IllegalStateException("Unexpected value: " + asientos);
        }
        int idReserva = 0;
        idReserva++;
        Reserva reserva = new Reserva(id, nombre, asiento, idReserva);
        aerolinea.registarReserva(reserva);
    }
}
