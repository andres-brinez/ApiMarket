package com.market.marketAPI.repositories;

import com.market.marketAPI.models.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria); // Query Methods
    // query nativo
    // @Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);


}
