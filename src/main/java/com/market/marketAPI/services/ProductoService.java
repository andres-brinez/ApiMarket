package com.market.marketAPI.services;

import com.market.marketAPI.models.Producto;
import com.market.marketAPI.repositories.ProductoCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired // se hace la inyeccion de dependencias para poder usar los métodos de la interfaz
    private ProductoCrudRepository productoCrudRepository; // se crea una variable de tipo ProductoCrudRepository para poder acceder a los métodos de la interfaz

    // muestra la lista de productos
    public List<Producto> getAll(){return (List<Producto>) productoCrudRepository.findAll();}

    // mostrar productos  por categoria
    public List<Producto> getByCategoria(int idCategoria){return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);}

    // getEscasos
    public Optional <List<Producto>> getEscasos(int cantidad)
    {
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad, true);
    }

    // getProducto
    public Optional<Producto> getProducto(int idProducto)
    {
        return productoCrudRepository.findById(idProducto);
    }

    // save
    public Producto save(Producto producto)
    {
        return productoCrudRepository.save(producto);
    }

    // delete
    public boolean delete(int idProducto){
        productoCrudRepository.deleteById(idProducto);
        if (getProducto(idProducto).isEmpty())
        {
            return true;
        }
        return false;
    }


}
