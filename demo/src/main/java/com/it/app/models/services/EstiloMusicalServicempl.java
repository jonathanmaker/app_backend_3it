package com.it.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.it.app.models.dao.IEstiloDao;
import com.it.app.models.entity.EstiloMusical;
@Service
public class EstiloMusicalServicempl implements IEstiloMusicalService{
	@Autowired
	private IEstiloDao estiloDao;
	@Override
	@Transactional(readOnly=true)
	public List<EstiloMusical> findAll() {
		
		return (List<EstiloMusical>) estiloDao.findAll();
	}
	@Override
	@Transactional(readOnly=true)
	public EstiloMusical findById(Long id) {
		// TODO Auto-generated method stub
		return estiloDao.findById(id).orElse(null);
	}
	@Override
	@Transactional
	public EstiloMusical save(EstiloMusical estiloMusical) {
		// TODO Auto-generated method stub
		return estiloDao.save(estiloMusical);
	}
	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		estiloDao.deleteById(id);
		
	}

}
