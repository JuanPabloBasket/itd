package com.examen.itdappweb.repository;

import org.springframework.data.repository.CrudRepository;
import com.examen.itdappweb.model.Cliente;

public interface IClienteDAO extends CrudRepository<Cliente, Integer>{

}
