package com.JaSONes.ProyectoFinalConectaEmpleo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.JaSONes.ProyectoFinalConectaEmpleo.model.Servicio;

@Repository
public class ServicioDaoImpl implements ServicioDao {
	
	private static List<Servicio> servicios;

	@Override
	public Servicio save(Servicio servicio) {
		if (!servicios.contains(servicio)) {
			servicios.add((Servicio) servicio);
			return servicio;
			}
			return null;

	}

	@Override
	public void edit(Servicio servicio) {
		int posicion = servicios.indexOf(servicio);
		if (posicion >= 0) {
			servicios.remove(posicion);
			servicios.add((Servicio) servicio);
		}

		
	}

	@Override
	public void delete(Servicio servicio) {
		int posicion = servicios.indexOf(servicio);
		if (posicion >= 0) {
			servicios.remove(posicion);
		}

		
	}

	@Override
	public List<Servicio> getAll() {

		return servicios;
	}

	@Override
	public Servicio get(int id) {
		int posicion = servicios.indexOf(new Servicio(id, null, null, null));
		return posicion >= 0 ? servicios.get(posicion) : null;

		}



	

}
