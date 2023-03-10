package com.seguni.seguni.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seguni.seguni.dto.ClienteDTO;
import com.seguni.seguni.entity.Cliente;

@Repository("clienteRepository")
public interface ClienteRepository extends JpaRepository<Cliente, Serializable>{
	
	public List<ClienteDTO> findByNombre(String nombre);

}
