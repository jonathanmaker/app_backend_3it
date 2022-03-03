package com.it.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.it.app.models.entity.Cliente;

/**
 * implementacion de interface de la clase cliente para desacoplar los metodos
 * @author cavef
 *
 */

public interface IClienteDao extends CrudRepository<Cliente, Long>{
	

}
