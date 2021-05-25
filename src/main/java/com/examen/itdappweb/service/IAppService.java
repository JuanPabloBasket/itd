package com.examen.itdappweb.service;

import java.util.List;

import com.examen.itdappweb.model.Cliente;
import com.examen.itdappweb.model.Producto;
import com.examen.itdappweb.model.Proveedor;

public interface IAppService {
	public List<Producto> findAllProductos();

	public Producto findProductoById(Integer id);
	
	public List<Proveedor> findAllProveedores();

	public Producto findProveedorById(Integer id);
	
	public List<Cliente> findAllClientes();

	public Cliente findClienteById(Integer id);
	
	public void deleteProveedor(Integer nif);
	
	public void deleteProdutos(Integer codigo);
	
	public void deleteClientes(Integer dni);
}