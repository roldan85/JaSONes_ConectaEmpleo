package com.JaSONes.ProyectoFinalConectaEmpleo.dao;

import java.util.List;

import com.JaSONes.ProyectoFinalConectaEmpleo.model.Servicio;

public interface ServicioDao {
	
	public Servicio save(Servicio servicio);

	public void edit(Servicio servicio);

	public void delete(Servicio servicio);

	public List<Servicio> getAll();

	public Servicio get(int id);

}
