package com.market.marketAPI.controllers;

import com.market.marketAPI.models.Producto;
import com.market.marketAPI.services.ProductosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired // Conecta esta clase  con el servicio
    ProductosServices productosServices; // Se crea una instancia del servicio para poder usar los metodos de jpa

    @GetMapping("/all")
    public List<Producto> getAllProductos(){
        return productosServices.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Producto> getProductoById(@PathVariable("id") int id){
        return productosServices.getProducto(id);
    }

    @GetMapping("/category/{id}")
    public List<Producto> getByCategoria(@PathVariable("id") int idCategoria){
        return productosServices.getByCategoria(idCategoria);
    }

    @PostMapping("/save")
    public Producto save(@RequestBody Producto producto){
        return productosServices.save(producto);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int idProducto){
        return productosServices.delete(idProducto);
    }

    @GetMapping("/escasos/{cantidad}")
    public Optional<List<Producto>> getEscasos(@PathVariable("cantidad") int cantidad){
        return productosServices.getEscasos(cantidad);
    }


}
