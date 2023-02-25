package com.seguni.seguni.ws;

import java.util.ArrayList;

import java.util.List;
import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
import com.seguni.seguni.repository.ClienteRepository;
import com.seguni.seguni.repository.CompaniaRepository;
import com.seguni.seguni.repository.CompaniaSegurosRepository;
import com.seguni.seguni.repository.PeritoRepository;
import com.seguni.seguni.repository.SeguroRepository;
import com.seguni.seguni.repository.SiniestroRepository;
import com.seguni.seguni.wsint.ServicioInt;

@Component
public class ServicioImp implements ServicioInt{

	@Autowired
	ClienteRepository clienteRepository;
	
	@Override
	public List<ClienteDTO> mostrarCliente() {
		List<Cliente> cliente = clienteRepository.findAll();
		List<ClienteDTO> clienteDTO = new ArrayList<>();
		
		for (Cliente clientes : cliente) {
			clienteDTO.add(new ClienteDTO(
					clientes.getDniCl(),
					clientes.getNombre(),
					clientes.getPrimerApellido(),
					clientes.getSegundoApellido(),
					clientes.getClaseVia(),
					clientes.getNombreVia(),
					clientes.getNumeroVia(),
					clientes.getCodigoPostal(),
					clientes.getCiudad(),
					clientes.getTelefono(),
					clientes.getObservaciones()));
		}
		return clienteDTO;
	}
	
	@Override
	public List<ClienteDTO> buscaNombre(String nombre) {
		return clienteRepository.findByNombre(nombre);
	}
	
	@Override
	public Cliente guardaCliente(ClienteDTO cliente) {
		Cliente cl = new Cliente();
		cl.setDniCl(cliente.getDniCl());
		cl.setNombre(cliente.getNombre());
		cl.setPrimerApellido(cliente.getPrimerApellido());
		cl.setSegundoApellido(cliente.getSegundoApellido());
		cl.setClaseVia(cliente.getClaseVia());
		cl.setNombreVia(cliente.getNombreVia());
		cl.setNumeroVia(cliente.getNumeroVia());
		cl.setCodigoPostal(cliente.getCodigoPostal());
		cl.setCiudad(cliente.getCiudad());
		cl.setTelefono(cliente.getTelefono());
		cl.setObservaciones(cliente.getObservaciones());
		return clienteRepository.save(cl);
	}
	
	@Override
	public void eliminarCliente(Long dniCl) {
		clienteRepository.deleteById(dniCl);
		
	}
	
	@Autowired
	SeguroRepository seguroRepository;

	@Override
	public List<SeguroDTO> mostrarSeguros() {
		List<Seguro> seguro = seguroRepository.findAll();
		List<SeguroDTO> seguroDTO = new ArrayList<>();
		
		for(Seguro seguros : seguro) {
			seguroDTO.add(new SeguroDTO(
					seguros.getNumeroPoliza(),
					seguros.getRamo(),
					seguros.getFechaInicio(),
					seguros.getFechaVencimiento(),
					seguros.getCondicionesParticulares(),
					seguros.getObservaciones(),
					seguros.getCliente(),
					seguros.getCompania()));	
		}
		return seguroDTO;
	}
	
	@Override
	public List<Seguro> buscaFecha(Date fechaVencimiento) {
		return seguroRepository.findByFechaVencimientoAfter(fechaVencimiento);
	}
	
	@Override
	public List<Seguro> orderPoliza(Long numeroPoliza) {
		return seguroRepository.findByNumeroPolizaOrderByRamoAsc(numeroPoliza);
	}

	@Override
	public Seguro guardarSeguro(SeguroDTO seguro) {
		Seguro seguros = new Seguro();
		seguros.setNumeroPoliza(seguro.getNumeroPoliza());
		seguros.setRamo(seguro.getRamo());
		seguros.setFechaInicio(seguro.getFechaInicio());
		seguros.setFechaVencimiento(seguro.getFechaVencimiento());
		seguros.setCondicionesParticulares(seguro.getCondicionesParticulares());
		seguros.setObservaciones(seguro.getObservaciones());
		seguros.setCliente(seguro.getCliente());
		seguros.setCompania(seguro.getCompania());
		
		
		return seguroRepository.save(seguros);
	}
	


	@Override
	public Seguro guardarSeguro2(Seguro seguro) {
		return seguroRepository.save(seguro);
	}
	
	@Override
	public void eliminarSeguro(Long numeroPoliza) {
		seguroRepository.deleteById(numeroPoliza);
	}
	
	@Autowired
	CompaniaRepository companiaRepository;
	
	@Override
	public List<CompaniaDTO> mostrarCompania() {
		List<Compania> companias = companiaRepository.findAll();
		List<CompaniaDTO> companiaDTO = new ArrayList<>();
		
		for (Compania compania : companias) {
			companiaDTO.add(new CompaniaDTO(
					compania.getNombreCompania(),
					compania.getClaseVia(),
					compania.getNombreVia(),
					compania.getNumeroVia(),
					compania.getCodigoPostal(),
					compania.getTelefonoContratacion(),
					compania.getTelefonoSiniestros(),
					compania.getNotas()));
				
			}
		return companiaDTO;
	}

	@Override
	public Compania guardarCompania(CompaniaDTO compania) {
		Compania companias = new Compania();
		companias.setNombreCompania(compania.getNombreCompania());
		companias.setClaseVia(compania.getNombreVia());
		companias.setNombreVia(compania.getNombreVia());
		companias.setNumeroVia(compania.getNumeroVia());
		companias.setCodigoPostal(compania.getCodigoPostal());
		companias.setTelefonoContratacion(compania.getTelefonoContratacion());
		companias.setTelefonoSiniestros(compania.getTelefonoSiniestro());
		companias.setNotas(compania.getNotas());
		companias.setSeguro(compania.getSeguro());
	
		
		
		
		return companiaRepository.save(companias);
	}
	
	@Override
	public void eliminarCompania(String nombreCompania) {
		companiaRepository.deleteById(nombreCompania);
		
	}

	@Autowired
	CompaniaSegurosRepository companiaSegurosRepository;
	
	@Override
	public List<CompaniaSegurosDTO> mostrarComSeg() {
		List<CompaniaSeguros> compSeg = companiaSegurosRepository.findAll();
		List<CompaniaSegurosDTO> compSegDTO = new ArrayList<>();
		
		for(CompaniaSeguros compSegu : compSeg) {
			compSegDTO.add(new CompaniaSegurosDTO(
					compSegu.getId(),
					compSegu.getNumeroPoliza(),
					compSegu.getNombreCompania()));
			
		}
		return compSegDTO;
	}

	@Override
	public CompaniaSeguros guardarCompSeg(CompaniaSegurosDTO companiaSeguros) {
		CompaniaSeguros compSeg = new CompaniaSeguros();
		compSeg.setId(companiaSeguros.getId());
		compSeg.setNumeroPoliza(companiaSeguros.getNumeroPoliza());
		compSeg.setNombreCompania(companiaSeguros.getNombreCompania());
		return companiaSegurosRepository.save(compSeg);
	}
	
	@Override
	public void eliminarCompSeg(Long id) {
		companiaSegurosRepository.deleteById(id);
		
	}

	@Autowired
	PeritoRepository peritoRepository;
	
	@Override
	public List<PeritoDTO> mostrarPerito() {
		List<Perito> perito = peritoRepository.findAll();
		List<PeritoDTO> peritoDTO = new ArrayList<>();
		
		for(Perito peritos : perito) {
			peritoDTO.add(new PeritoDTO(
					peritos.getDniPerito(),
					peritos.getNombrePerito(),
					peritos.getApellidoPerito1(),
					peritos.getApellidoPerito2(),
					peritos.getTelefonoContacto(),
					peritos.getTelefonoOficina(),
					peritos.getClaseVia(),
					peritos.getNombreVia(),
					peritos.getNumeroVia(),
					peritos.getCodigoPostal(),
					peritos.getCiudad()));
			
		}
		return peritoDTO;
	}

	@Override
	public Perito guardarPerito(PeritoDTO perito) {
		Perito peritos = new Perito();
		peritos.setDniPerito(perito.getDniPerito());
		peritos.setNombrePerito(perito.getNombrePerito());
		peritos.setApellidoPerito1(perito.getApellidoPerito1());
		peritos.setApellidoPerito2(perito.getApellidoPerito2());
		peritos.setTelefonoContacto(perito.getTelefonoContacto());
		peritos.setTelefonoOficina(perito.getTelefonoOficina());
		peritos.setClaseVia(perito.getClaseVia());
		peritos.setNombreVia(perito.getNombreVia());
		peritos.setNumeroVia(perito.getNumeroVia());
		peritos.setCodigoPostal(perito.getCodigoPostal());
		peritos.setCiudad(perito.getCiudad());
		return peritoRepository.save(peritos);
	}
	
	@Override
	public void eliminarPerito(Long dniPerito) {
		peritoRepository.deleteById(dniPerito);
		
	}

	@Autowired
	SiniestroRepository siniestroRepository;

	@Override
	public List<SiniestroDTO> mostrarSiniestros() {
		List<Siniestro> siniestro = siniestroRepository.findAll();
		List<SiniestroDTO> siniestroDTO = new ArrayList<>();
		
		for (Siniestro siniestros : siniestro) {
			siniestroDTO.add(new SiniestroDTO(
			siniestros.getIdSiniestro(),
			siniestros.getFechaSiniestro(),
			siniestros.getCausas(),
			siniestros.getAceptado(),
			siniestros.getIndemnizacion(),
			siniestros.getNumeroPoliza(),
			siniestros.getPerito()));
		}
		return siniestroDTO;
	}

	@Override
	public Siniestro guardarSiniestro(SiniestroDTO siniestro) {
		Siniestro siniestros = new Siniestro();
		siniestros.setIdSiniestro(siniestro.getIdSiniestro());
		siniestros.setFechaSiniestro(siniestro.getFechaSiniestro());
		siniestros.setCausas(siniestro.getCausas());
		siniestros.setAceptado(siniestro.getAceptado());
		siniestros.setIndemnizacion(siniestros.getIndemnizacion());
		siniestros.setNumeroPoliza(siniestro.getNumeroPoliza());
		siniestros.setPerito(siniestro.getPerito());
		return siniestroRepository.save(siniestros);
	}

	@Override
	public void eliminarSiniestro(Long idSiniestro) {
		siniestroRepository.deleteById(idSiniestro);
		
	}






	

}
