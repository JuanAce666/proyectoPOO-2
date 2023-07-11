package org.example.modelos;

import java.time.LocalDate;

public class Reserva {
    private int id;
    private int idusuario;
    private int idoferta;
    private double costototal;
    private LocalDate fechareserva;

    public Reserva() {
    }

    public Reserva(int id, int idusuario, int idoferta, double costototal, LocalDate fechareserva) {
        this.id = id;
        this.idusuario = idusuario;
        this.idoferta = idoferta;
        this.costototal = costototal;
        this.fechareserva = fechareserva;
    }

    @Override
    public String toString() {
        return "Reserva " +
                "id: " + id +
                ", id usuario: " + idusuario +
                ", id oferta: " + idoferta +
                ", costo total: " + costototal +
                ", fecha reserva: " + fechareserva +
                ' ';
    }
}
