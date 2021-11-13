package co.edu.unbosque.ciclo4back.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import co.edu.unbosque.ciclo4back.DAO.DetalleVentasDAO;
import co.edu.unbosque.ciclo4back.modelo.DetalleVentas;

@RestController
@RequestMapping("detalle_venta")
public class DetalleVentasAPI {
	@Autowired
	private DetalleVentasDAO detalleVentasDAO;
	
	@PostMapping ("/guardar")
	public void guardar(@RequestBody DetalleVentas detalleVentas) {
		detalleVentasDAO.save(detalleVentas);		
	}
	
	@GetMapping("/listar")
	public List<DetalleVentas> listar(){
		return detalleVentasDAO.findAll();		
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		detalleVentasDAO.deleteById(id);		
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody DetalleVentas detalleVentas) {
		detalleVentasDAO.save(detalleVentas);
	}


}
