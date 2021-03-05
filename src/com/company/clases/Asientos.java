package com.company.clases;

public enum Asientos {
    VALUE(50.20, "Value"), REGULAR(80.70, "Regular"), PLUS(120.60, "Plus"), FLEXIPLUS(180.99, "FlexiPlus");
    private double precio;
    private String nombreAsiento;

    Asientos(double precio, String nombreAsiento) {
        this.precio = precio;
        this.nombreAsiento = nombreAsiento;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombreAsiento() {
        return nombreAsiento;
    }

}
