package com.mycompany.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.modell.Empresa;
import com.mycompany.repository.EmpresaRepository;
@Service

public  class EmpresaServiceImpl implements EmpresaService{
	
	@Autowired
	EmpresaRepository empresaRepository;

	@Override
	public Empresa findById(long id) {
		
		return empresaRepository.findById(id);
	}

	@Override
	public Optional<Empresa>findByDireccion(String direccion) {
		return empresaRepository.findByDireccion(direccion);
	}
	
	@Override
	public void saveEmpresa(Empresa empresa) {
			empresaRepository.save(empresa);
	}

	@Override
	public void updateEmpresa(Empresa empresa) {
		empresaRepository.save(empresa);
		
	}

	@Override
	public void deleteEmpresaById(long id) {
		empresaRepository.deleteById(id);
		
	}

	@Override
	public List<Empresa> findAllEmpresa() {
	
		return empresaRepository.findAll();
	}

	@Override
	public void deleteAllEmpresa() {
		 empresaRepository.deleteAll();
	}

	@Override
	public boolean isEmpresaExist(Empresa empresa) {
		return findByDireccion(empresa.getDireccion())!=null;
	}

}

