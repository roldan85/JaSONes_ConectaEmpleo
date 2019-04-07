package com.JaSONes.ProyectoFinalConectaEmpleo.model;

import java.io.Serializable;

public class ServicioModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String nombre_del_Servicio;
	private Double precio_del_Servicio;
	private String notas;
	
	
	//Constructor con parámetros
	public ServicioModel(int id, String nombre_del_Servicio,
			Double precio_del_Servicio, String notas) {
		super();
		this.id = id;
		this.nombre_del_Servicio = nombre_del_Servicio;
		this.precio_del_Servicio = precio_del_Servicio;
		this.notas = notas;
	}

	//Constructor por defecto
	public ServicioModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Getters and setters
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

	@Override
	public String toString() {
		return "ServiciosModel [id=" + id + ", nombre_del_Servicio=" + nombre_del_Servicio + ", precio_del_Servicio="
				+ precio_del_Servicio + ", notas=" + notas + "]";
	}
	
	
}
