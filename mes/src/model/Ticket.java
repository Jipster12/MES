package model;

import java.time.LocalDate;

public class Ticket {
    private float precioEmitido;
    private LocalDate fechaEmision;

    public Ticket() {
    }

    public Ticket(float precioEmitido, LocalDate fechaEmision) {
        this.precioEmitido = precioEmitido;
        this.fechaEmision = fechaEmision;
    }

    public float getPrecioEmitido() {
        return precioEmitido;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

}

