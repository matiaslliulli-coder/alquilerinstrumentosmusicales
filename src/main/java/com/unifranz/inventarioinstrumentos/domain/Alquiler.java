package com.unifranz.inventarioinstrumentos.domain;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Alquiler {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Instrumento instrumento;

    @ManyToOne
    private Cliente cliente;

    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double montoTotal;
    private String estado; // activo, finalizado

    public Alquiler() {}

    public Alquiler(Instrumento instrumento, Cliente cliente,
                     LocalDate fechaInicio, LocalDate fechaFin,
                     double montoTotal) {
        this.instrumento = instrumento;
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.montoTotal = montoTotal;
        this.estado = "activo";
    }

    public Long getId() { return id; }
    public Instrumento getInstrumento() { return instrumento; }
    public void setInstrumento(Instrumento instrumento) { this.instrumento = instrumento; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public LocalDate getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(LocalDate fechaInicio) { this.fechaInicio = fechaInicio; }
    public LocalDate getFechaFin() { return fechaFin; }
    public void setFechaFin(LocalDate fechaFin) { this.fechaFin = fechaFin; }
    public double getMontoTotal() { return montoTotal; }
    public void setMontoTotal(double montoTotal) { this.montoTotal = montoTotal; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
