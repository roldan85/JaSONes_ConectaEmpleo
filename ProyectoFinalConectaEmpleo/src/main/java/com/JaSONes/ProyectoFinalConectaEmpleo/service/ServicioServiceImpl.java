package com.JaSONes.ProyectoFinalConectaEmpleo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JaSONes.ProyectoFinalConectaEmpleo.dao.ServicioDao;
import com.JaSONes.ProyectoFinalConectaEmpleo.model.Servicio;

@Service("servicioService")
public class ServicioServiceImpl implements ServicioService {

	@Autowired
	ServicioDao servicioDao;

	@Override
	public Servicio save(Servicio servicio) {

		return this.servicioDao.save(servicio);
	}

	@Override
	public void edit(Servicio servicio) {
		this.servicioDao.edit(servicio);

		
	}

	@Override
	public void delete(Servicio servicio) {
		this.servicioDao.delete(servicio);
		
	}

	@Override
	public List<Servicio> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Servicio get(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	
	
}
