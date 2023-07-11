package org.example.modelos;

public class Herramienta {

     private String nombre;
     private Integer capacidad;

    public Herramienta() {
    }

    public Herramienta(String nombre, Integer capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Herramienta " +
                "nombre: '" + nombre + '\'' +
                ", capacidad: " + capacidad +
                ' ';
    }
}


