package com.mycompany.modell;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empresa")
public class Empresa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_empresa")
	long id;
	
	@Column(name = "razon_social")
	String razon_social;
	
	@Column(name = "direccion")
	String direccion;
	
	@Column(name = "ruc")
	String ruc;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRazon_social() {
		return razon_social;
	}

	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public Empresa(long id, String razon_social, String direccion, String ruc) {
		super();
		this.id = id;
		this.razon_social = razon_social;
		this.direccion = direccion;
		this.ruc = ruc;
	}

	public Empresa() {
		super();
		// TODO Auto-generated constructor stub
	}
}
	