package com.JaSONes.ProyectoFinalConectaEmpleo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.JaSONes.ProyectoFinalConectaEmpleo.model.ServicioModel;

@Repository
public class ServicioDaoImpl implements ServicioDao {
	
	private static List<ServicioModel> servicios;

	@Override
	public ServicioModel save(ServicioModel servicio) {
		if (!servicios.contains(servicio)) {
			servicios.add((ServicioModel) servicio);
			return servicio;
			}
			return null;

	}

	@Override
	public void edit(ServicioModel servicio) {
		int posicion = servicios.indexOf(servicio);
		if (posicion >= 0) {
			servicios.remove(posicion);
			servicios.add((ServicioModel) servicio);
		}

		
	}

	@Override
	public void delete(ServicioModel servicio) {
		int posicion = servicios.indexOf(servicio);
		if (posicion >= 0) {
			servicios.remove(posicion);
		}

		
	}

	@Override
	public List<ServicioModel> getAll() {

		return servicios;
	}

	@Override
	public ServicioModel get(int id) {
		int posicion = servicios.indexOf(new ServicioModel(id, null, null, null));
		return posicion >= 0 ? servicios.get(posicion) : null;

		}



	

}
