package org.example.modelos;

public class Persona {
    private int id;
    private String documento;
    private String nombre;
    private String correo;
    private int ubicacion;

    public Persona() {
    }

    public Persona(int id, String documento, String nombre, String correo, int ubicacion) {
        this.id = id;
        this.documento = documento;
        this.nombre = nombre;
        this.correo = correo;
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Persona " +
                "id: " + id +
                ", documento: '" + documento + '\'' +
                ", nombre: '" + nombre + '\'' +
                ", correo: '" + correo + '\'' +
                ", ubicacion: " + ubicacion +
                ' ';
    }
}
