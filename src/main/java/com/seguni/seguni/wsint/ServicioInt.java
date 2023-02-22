package com.seguni.seguni.wsint;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seguni.seguni.dto.ClienteDTO;
import com.seguni.seguni.dto.CompaniaDTO;
import com.seguni.seguni.dto.CompaniaSegurosDTO;
import com.seguni.seguni.dto.PeritoDTO;
import com.seguni.seguni.dto.SeguroDTO;
import com.seguni.seguni.dto.SiniestroDTO;
import com.seguni.seguni.entity.Cliente;
import com.seguni.seguni.entity.Compania;
import com.seguni.seguni.entity.CompaniaSeguros;
import com.seguni.seguni.entity.Perito;
import com.seguni.seguni.entity.Seguro;
import com.seguni.seguni.entity.Siniestro;


@RestController
@RequestMapping("/Seguni")
@CrossOrigin
public interface ServicioInt {
	
	
	@GetMapping("/cliente")
	public List<ClienteDTO> mostrarCliente();
	
	@PostMapping("/cliente/guardar")
	public Cliente guardaCliente (@RequestBody ClienteDTO cliente);
	
	@DeleteMapping("/cliente/eliminar/{dniCl}")
	public void eliminarCliente (@PathVariable ("dniCl") Long dniCl);
	
	@GetMapping("/seguros")
	public List<SeguroDTO> mostrarSeguros();
	
	@PostMapping("/seguros/guardar")
	public Seguro guardarSeguro (@RequestBody SeguroDTO seguro);
	
	@DeleteMapping("/seguros/eliminar/{numeroPoliza}")
	public void eliminarSeguro (@PathVariable ("numeroPoliza") Long numeroPoliza);
	
	@PostMapping("/seguros/guardar2")
	public Seguro guardarSeguro2 (@RequestBody Seguro seguro);
	
	@GetMapping("/compania")
	public List<CompaniaDTO> mostrarCompania();
	
	@PostMapping("/compania/guardar")
	public Compania guardarCompania (@RequestBody CompaniaDTO compania);
	
	@DeleteMapping("/compania/eliminar/{nombreCompania}")
	public void eliminarCompania (@PathVariable ("nombreCompania")String nombreCompania);
	
	@GetMapping("/companiaSeguros")
	public List<CompaniaSegurosDTO> mostrarComSeg();
	
	@PostMapping("/companiaSeguros/guardar")
	public CompaniaSeguros guardarCompSeg (@RequestBody CompaniaSegurosDTO companiaSeguros);
	
	@DeleteMapping("/companiaSeguros/eliminar/{id}")
	public void eliminarCompSeg (@PathVariable ("id") Long id);
	
	@GetMapping("/perito")
	public List<PeritoDTO> mostrarPerito();
	
	@PostMapping("/perito/guardar")
	public Perito guardarPerito (@RequestBody PeritoDTO perito);
	
	@DeleteMapping("perito/eliminar/{dniPerito}")
	public void eliminarPerito (@PathVariable ("dniPerito")Long dniPerito);
	
	@GetMapping("/siniestro")
	public List<SiniestroDTO> mostrarSiniestros();
	
	@PostMapping("/siniestro/guardar")
	public Siniestro guardarSiniestro (@RequestBody SiniestroDTO siniestro);
	
	@DeleteMapping("siniestro/eliminar/{idSiniestro}")
	public void eliminarSiniestro (@PathVariable ("idSiniestro")Long idSiniestro);
	
	

}
