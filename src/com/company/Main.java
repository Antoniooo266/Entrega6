package com.company;
import com.company.clases.Aerolinea;
import com.company.clases.Pasajero;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a Aerolineas ACR");
        System.out.println("Rellena todos los datos para realizar tu reserva");
        boolean salir = false;
        while (salir) {
            int opcion = 0;
            System.out.println("1. Crear Pasajero");
            switch (opcion) {
                case 1:
                Aerolinea.crearPasajero();

            }
        }
    }

}
