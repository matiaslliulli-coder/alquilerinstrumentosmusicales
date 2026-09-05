package com.unifranz.inventarioinstrumentos.domain;

import jakarta.persistence.*;

@Entity
public class Instrumento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String tipo;
    private String estado;
    private double precioPorDia;
    private boolean disponible = true;

    public Instrumento() {}

    public Instrumento(String nombre, String tipo, String estado, double precioPorDia) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.estado = estado;
        this.precioPorDia = precioPorDia;
    }

    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public double getPrecioPorDia() { return precioPorDia; }
    public void setPrecioPorDia(double precioPorDia) { this.precioPorDia = precioPorDia; }
    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }
}
