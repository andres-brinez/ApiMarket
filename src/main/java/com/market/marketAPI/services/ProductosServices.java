package com.market.marketAPI.services;

import com.market.marketAPI.models.Producto;
import com.market.marketAPI.repositories.ProductoCrudRepository;

import java.util.List;

public class ProductosServices {

    private ProductoCrudRepository productoCrudRepository; // se crea una variable de tipo ProductoCrudRepository para poder acceder a los métodos de la interfaz

    // muestra la lista de productos
    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }

    // mostrar productos  por categoria
    public List<Producto> getByCategoria(int idCategoria){
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }


}
