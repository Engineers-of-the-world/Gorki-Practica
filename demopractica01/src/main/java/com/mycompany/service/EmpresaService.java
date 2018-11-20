package com.mycompany.service;

import java.util.List;
import java.util.Optional;

import com.mycompany.modell.Empresa;


public interface EmpresaService {
	
    Empresa findById(long id);
	
    Optional<Empresa> findByDireccion(String direccion);
	
	void saveEmpresa(Empresa empresa);
	
	void updateEmpresa(Empresa empresa);
	
	void deleteEmpresaById(long id);

	List<Empresa> findAllEmpresa(); 
	
	void deleteAllEmpresa();
	
	public boolean isEmpresaExist(Empresa empresa);
	

}
