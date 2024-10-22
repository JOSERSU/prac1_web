package com.upiiz.ecommerce.models;

public class Producto {
    private Long id;
    private String nombre;
    private Long categoria_id;

    public Producto() {}

    public Producto(Long id, String nombre, Long categoria_id) {
        this.id = id;
        this.nombre = nombre;
        this.categoria_id = categoria_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(Long categoria_id) {
        this.categoria_id = categoria_id;
    }
}
