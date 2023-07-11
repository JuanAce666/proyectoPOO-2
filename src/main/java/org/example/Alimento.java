package org.example;

public class Alimento {
     private String nombre;
     private Integer calorias;


    public Alimento() {
    }

    public Alimento(String nombre, Integer calorias) {
        this.nombre = nombre;
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "Alimento" +
                " nombre: " + nombre + '\'' +
                ", calorias: " + calorias +
                ' ';
    }
}
