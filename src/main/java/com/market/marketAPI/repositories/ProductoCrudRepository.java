package com.market.marketAPI.repositories;

import com.market.marketAPI.models.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria); // Query Methods
    // query nativo
    // @Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
}
