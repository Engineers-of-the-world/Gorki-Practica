package com.mycompany.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.modell.Empresa;
import com.mycompany.service.EmpresaService;

@RestController
@RequestMapping(value="/api/emp")


public class EmpresaCtrl {
	
	@Autowired
	
	EmpresaService empresaService;
	
	@GetMapping(value="/all")
 protected List<Empresa> allEmpresa(){
	 return empresaService.findAllEmpresa();
 } 
	@PostMapping("/ifexist")
 protected boolean isExistEmpresa(@RequestBody Empresa empresa){
	 return empresaService.isEmpresaExist(empresa);
 }
	
	@PostMapping(value="/save")
 protected void save(@RequestBody Empresa empresa){
		
		if(empresaService.isEmpresaExist(empresa)) {
			empresaService.updateEmpresa(empresa);
			System.out.println("la empresa ha sido actualizado");
			
		}else {
			empresaService.saveEmpresa(empresa);
			System.out.println("la empresa ha sido creado");
		}
		empresaService.saveEmpresa(empresa);
	 
 }
	@GetMapping(value="/update")
 protected String update(){
	 return "Welcome a spring boot";
 }	
	@GetMapping(value="/delete")
 protected String delete(){
	 return "Welcome a spring boot";
 }	
}

