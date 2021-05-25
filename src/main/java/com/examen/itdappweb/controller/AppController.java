package com.examen.itdappweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.examen.itdappweb.model.Cliente;
import com.examen.itdappweb.model.Producto;
import com.examen.itdappweb.model.Proveedor;
import com.examen.itdappweb.service.IAppService;

@RestController
public class AppController {
	
	@Autowired
	private IAppService appService;
	
	@GetMapping("/productos")
	public ResponseEntity<?> productos() {
		try{
			List<Producto> produtos = appService.findAllProductos();
			return new ResponseEntity<List<Producto>>(produtos, HttpStatus.OK); 
		} catch (Exception e){
			e.printStackTrace();
			return new ResponseEntity<>("Error intentando obtener productos", HttpStatus.INTERNAL_SERVER_ERROR); 
		}
	}

	@GetMapping("/clientes")
	public ResponseEntity<?> clientes() {
		try{
			List<Cliente> clientes = appService.findAllClientes();
			return new ResponseEntity<List<Cliente>>(clientes, HttpStatus.OK); 
		} catch (Exception e){
			e.printStackTrace();
			return new ResponseEntity<>("Error intentando obtener clientes", HttpStatus.INTERNAL_SERVER_ERROR); 
		}
	}
	
	@GetMapping("/proveedores")
	public ResponseEntity<?> proveedores() {
		try{
			List<Proveedor> proveedores = appService.findAllProveedores();
			return new ResponseEntity<List<Proveedor>>(proveedores, HttpStatus.OK); 
		} catch (Exception e){
			e.printStackTrace();
			return new ResponseEntity<>("Error intentando obtener proveedores", HttpStatus.INTERNAL_SERVER_ERROR); 
		}
	}
	
	@DeleteMapping("/productos/{codigo}")
	public ResponseEntity<?> productosDelete(@PathVariable String codigo) {
		try{
			appService.deleteProdutos(Integer.parseInt(codigo));
			return new ResponseEntity<>("", HttpStatus.OK); 
		} catch (Exception e){
			e.printStackTrace();
			return new ResponseEntity<>("Error intentando borrar productos", HttpStatus.INTERNAL_SERVER_ERROR); 
		}
	}
	
	@DeleteMapping("/proveedores/{nif}")
	public ResponseEntity<?> proveedoresDelete(@PathVariable String nif) {
		try{
			appService.deleteProveedor(Integer.parseInt(nif));
			return new ResponseEntity<>("", HttpStatus.OK); 
		} catch (Exception e){
			e.printStackTrace();
			return new ResponseEntity<>("Error intentando borrar proveedores", HttpStatus.INTERNAL_SERVER_ERROR); 
		}
	}
	
	@DeleteMapping("/clientes/{dni}")
	public ResponseEntity<?> clientesDelete(@PathVariable String dni) {
		try{
			appService.deleteClientes(Integer.parseInt(dni));
			return new ResponseEntity<>("", HttpStatus.OK); 
		} catch (Exception e){
			e.printStackTrace();
			return new ResponseEntity<>("Error intentando borrar clientes", HttpStatus.INTERNAL_SERVER_ERROR); 
		}
	}
}