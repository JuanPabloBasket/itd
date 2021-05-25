package com.examen.itdappweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.itdappweb.model.Cliente;
import com.examen.itdappweb.model.Producto;
import com.examen.itdappweb.model.Proveedor;
import com.examen.itdappweb.repository.IClienteDAO;
import com.examen.itdappweb.repository.IProductoDAO;
import com.examen.itdappweb.repository.IProveedorDAO;

@Service
public class AppService implements IAppService{

	@Autowired
	private IProveedorDAO proveedorDAO;
	
	@Autowired
	private IClienteDAO clienteDAO;
	
	@Autowired
	private IProductoDAO productoDAO;

	@Override
	public List<Producto> findAllProductos() {
		return (List<Producto>) productoDAO.findAll();
	}

	@Override
	public Producto findProductoById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Proveedor> findAllProveedores() {
		return (List<Proveedor>) proveedorDAO.findAll();
	}

	@Override
	public Producto findProveedorById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> findAllClientes() {
		return (List<Cliente>) clienteDAO.findAll();
	}

	@Override
	public Cliente findClienteById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProveedor(Integer nif) {
		proveedorDAO.deleteById(nif);
	}

	@Override
	public void deleteProdutos(Integer codigo) {
		productoDAO.deleteById(codigo);
	}

	@Override
	public void deleteClientes(Integer dni) {
		clienteDAO.deleteById(dni);
	}
}