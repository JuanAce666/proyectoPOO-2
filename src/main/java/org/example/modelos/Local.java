package org.example.modelos;

public class Local {
    private int id;
    private String nit;
    private String nombre;
    private int ubicacion;
    private String descripcion;

    public Local() {
    }

    public Local(int id, String nit, String nombre, int ubicacion, String descripcion) {
        this.id = id;
        this.nit = nit;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Local " +
                "id: " + id +
                ", nit: '" + nit + '\'' +
                ", nombre: '" + nombre + '\'' +
                ", ubicacion: " + ubicacion +
                ", descripcion: '" + descripcion + '\'' +
                ' ';
    }
}
