package com.market.marketAPI.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

// para cuando hay más de una llave primaria en una tabla

@Embeddable // Esta clase es embebida en otra clase (ComprasProducto), es decir que no tiene una tabla propia
public class ComprasProductoPK  implements Serializable {
    @Column(name = "id_compra")
    private Integer id_compra;

    @Column(name = "id_producto")
    private Integer id_producto;


    public Integer getId_compra() {
        return id_compra;
    }

    public void setId_compra(Integer id_compra) {
        this.id_compra = id_compra;
    }

    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }
}
