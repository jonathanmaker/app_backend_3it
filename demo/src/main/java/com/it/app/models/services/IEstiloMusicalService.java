package com.it.app.models.services;

import java.util.List;

import com.it.app.models.entity.EstiloMusical;

public interface IEstiloMusicalService {
	
	public List<EstiloMusical> findAll();
	
	public EstiloMusical findById(Long id);
	
	public EstiloMusical save(EstiloMusical estiloMusical);
	
	public void delete(Long id);


}
