package com.JaSONes.ProyectoFinalConectaEmpleo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JaSONes.ProyectoFinalConectaEmpleo.dao.ServicioDao;
import com.JaSONes.ProyectoFinalConectaEmpleo.model.ServicioModel;

@Service("servicioService")
public class ServicioServiceImpl implements ServicioService {

	@Autowired
	ServicioDao servicioDao;

	@Override
	public ServicioModel save(ServicioModel servicio) {

		return this.servicioDao.save(servicio);
	}

	@Override
	public void edit(ServicioModel servicio) {
		this.servicioDao.edit(servicio);

		
	}

	@Override
	public void delete(ServicioModel servicio) {
		this.servicioDao.delete(servicio);
		
	}

	@Override
	public List<ServicioModel> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServicioModel get(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	
	
}
