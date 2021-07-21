package com.example.productosapispringsecurity.producto;

import javax.persistence.*;

@Entity
@Table(name="productos")
public class ProductoEntity {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id_producto;
    private String nombre;
    private Double precio;

    public ProductoEntity() {
    }

    public ProductoEntity(Integer id_producto, String nombre, Double precio) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.precio = precio;
    }

    public ProductoEntity(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
