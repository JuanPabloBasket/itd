package com.examen.itdappweb.repository;

import org.springframework.data.repository.CrudRepository;
import com.examen.itdappweb.model.Producto;

public interface IProductoDAO extends CrudRepository<Producto, Integer>{

}
