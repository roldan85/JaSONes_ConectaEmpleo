package com.JaSONes.ProyectoFinalConectaEmpleo.service;

import java.util.List;

import com.JaSONes.ProyectoFinalConectaEmpleo.model.ServicioModel;

public interface ServicioService {
	
	public ServicioModel save(ServicioModel servicio);
	public void edit(ServicioModel servicio);
	public void delete(ServicioModel servicio);
	public List<ServicioModel> getAll();
	public ServicioModel get(int id);


}
