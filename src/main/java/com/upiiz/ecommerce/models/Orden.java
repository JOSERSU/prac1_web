package com.upiiz.ecommerce.models;

import java.util.Date;

public class Orden {
    private Long id;
    private Date fecha;
    private Long entrega_id;
    private Long cliente_id;

    public Orden() {}

    public Orden(Long id, Date fecha, Long entrega_id, Long cliente_id) {
        this.id = id;
        this.fecha = fecha;
        this.entrega_id = entrega_id;
        this.cliente_id = cliente_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Long getEntrega_id() {
        return entrega_id;
    }

    public void setEntrega_id(Long entrega_id) {
        this.entrega_id = entrega_id;
    }

    public Long getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Long cliente_id) {
        this.cliente_id = cliente_id;
    }
}
