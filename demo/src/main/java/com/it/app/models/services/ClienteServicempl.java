package com.it.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.it.app.models.dao.IClienteDao;
import com.it.app.models.entity.Cliente;

/**
 * Inyectamos el cliente dao y declaramos de manera explícita la transaccionalidad 
 * y con la anotacion de Service marcamos la clase como componente de servicio en spring 
 * @author cavef
 *
 */
@Service
public class ClienteServicempl implements IClienteService{
	@Autowired
	private IClienteDao clienteDao;
	@Override
	@Transactional(readOnly=true)
	public List<Cliente> findAll() {
		
		return (List<Cliente>) clienteDao.findAll();
	}
	@Override
	@Transactional(readOnly=true)
	public Cliente findById(Long id) {
		// TODO Auto-generated method stub
		return clienteDao.findById(id).orElse(null);
	}
	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteDao.save(cliente);
	}
	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		clienteDao.deleteById(id);
	}

}
