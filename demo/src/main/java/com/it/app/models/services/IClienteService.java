package com.it.app.models.services;

import java.util.List;

import com.it.app.models.entity.Cliente;

/**
 * interface que contiene los metodos a ser usados de manera pública 
 * @author cavef
 *
 */
public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);

}
