package com.market.marketAPI.controllers;

import com.market.marketAPI.services.ProductosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired // Conecta esta clase  con el servicio
    ProductosServices productosServices; // Se crea una instancia del servicio para poder usar los metodos de jpa

    
}
