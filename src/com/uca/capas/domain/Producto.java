package com.uca.capas.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Producto {

	@Size(message="El maximo de longitud es 30 ",max=30)
	@NotEmpty(message="No puede estar vacio")
	String nombre;
	
	@Size(message="El maximo de longitud es 30 ",max=30)
	@NotEmpty(message="No puede estar vacio")
	String marca;
	
	@Size(message="El maximo de longitud es 30 ",max=30)
	@NotEmpty(message="No puede estar vacio")
	String descripcion;
	
	@Size(message="El maximo de longitud es 30 ",max=30)
	@NotEmpty(message="No puede estar vacio")
	String categoria;
	
	@Size(message="El maximo de longitud es 30 ",max=30)
	@NotEmpty(message="No puede estar vacio")
	String precio;
	
	String fVencimiento;
	
	public Producto(String nombre, String marca, String descripcion, String categoria, String precio,
			String fVencimiento) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.precio = precio;
		this.fVencimiento = fVencimiento;
	}

	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getfVencimiento() {
		return fVencimiento;
	}

	public void setfVencimiento(String fVencimiento) {
		this.fVencimiento = fVencimiento;
	}
	
}
