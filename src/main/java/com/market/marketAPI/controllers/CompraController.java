package com.market.marketAPI.controllers;

import com.market.marketAPI.models.Compra;
import com.market.marketAPI.services.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// ? Esta clase usa Response Entity para devolver respuestas http

@RestController
@RequestMapping("/api/compra")
public class CompraController {

    @Autowired
    CompraService compraService;

@GetMapping("/hola")
    public String hola() {
        return "Hola mundo";
    }

    @GetMapping("/all")
    public ResponseEntity<List<Compra>> getAll() {
        return new ResponseEntity<>(compraService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/client/{idClient}")
    public ResponseEntity<List<Compra>> getByClient(@PathVariable("idClient") String clientId) {
        return compraService.getByCliente(clientId)
                .map(compras -> new ResponseEntity<>(compras, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Compra> save(@RequestBody Compra purchase) {
        return new ResponseEntity<>(compraService.save(purchase), HttpStatus.CREATED);
    }


}
