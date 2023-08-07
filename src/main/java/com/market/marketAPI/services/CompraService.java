package com.market.marketAPI.services;

import com.market.marketAPI.models.Compra;
import com.market.marketAPI.repositories.CompraCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompraService {

    @Autowired
    private CompraCrudRepository compraCrudRepository;

    public List<Compra> getAll(){
        return (List<Compra>) compraCrudRepository.findAll(); // devuelve un iterable, por eso se castea a lista
    }

    // obtener por cliente
    public Optional<List<Compra>> getByCliente(String idCliente){
        return compraCrudRepository.findByIdCliente(idCliente);
    }

    // save
    public Compra save(Compra compra){
        return compraCrudRepository.save(compra);
    }


}
