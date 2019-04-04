package com.JaSONes.ProyectoFinalConectaEmpleo.model;

public class servicios {
	private int id;
	private String nombre_del_Servicio;
	private Double precio_del_Servicio;
	private String notas;
	
	
	
	public servicios(String nombre_del_Servicio, Double precio_del_Servicio, String notas) {
		super();
		this.nombre_del_Servicio = nombre_del_Servicio;
		this.precio_del_Servicio = precio_del_Servicio;
		this.notas = notas;
	}
	
	
	public servicios() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre_del_Servicio() {
		return nombre_del_Servicio;
	}
	public void setNombre_del_Servicio(String nombre_del_Servicio) {
		this.nombre_del_Servicio = nombre_del_Servicio;
	}
	public Double getPrecio_del_Servicio() {
		return precio_del_Servicio;
	}
	public void setPrecio_del_Servicio(Double precio_del_Servicio) {
		this.precio_del_Servicio = precio_del_Servicio;
	}
	public String getNotas() {
		return notas;
	}
	public void setNotas(String notas) {
		this.notas = notas;
	}
	
	
	
	
	
}
