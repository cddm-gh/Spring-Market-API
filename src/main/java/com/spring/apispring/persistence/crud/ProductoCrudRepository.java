package com.spring.apispring.persistence.crud;

import com.spring.apispring.persistence.entities.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

// la interfaz recibe como parametros la tabla y el tipo de dato de su PK
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    // @Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
    // Query Methods
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado); // el parametro se debe llamar como está en la Entity
}
