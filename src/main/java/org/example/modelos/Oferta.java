package org.example.modelos;

import java.time.LocalDate;

public class Oferta {
    private int id;
    private String titulo;
    private String descripcion;
    private LocalDate fechainicio;
    private LocalDate fechafin;
    private double costopersona;
    private int idlocal;

    public Oferta() {
    }

    public Oferta(int id, String titulo, String descripcion, LocalDate fechainicio, LocalDate fechafin, double costopersona, int idlocal) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.costopersona = costopersona;
        this.idlocal = idlocal;
    }

    @Override
    public String toString() {
        return "Oferta " +
                "id: " + id +
                ", titulo: '" + titulo + '\'' +
                ", descripcion: '" + descripcion + '\'' +
                ", fecha inicio: " + fechainicio +
                ", fecha fin: " + fechafin +
                ", costo persona: " + costopersona +
                ", id local: " + idlocal +
                ' ';
    }
}
