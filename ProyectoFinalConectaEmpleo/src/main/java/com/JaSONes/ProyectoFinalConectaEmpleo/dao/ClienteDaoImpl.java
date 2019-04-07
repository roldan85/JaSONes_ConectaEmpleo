package com.JaSONes.ProyectoFinalConectaEmpleo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.JaSONes.ProyectoFinalConectaEmpleo.model.ClienteModel;

@Repository
public class ClienteDaoImpl implements ClienteDao {
	
	private static List<ClienteModel> clientes;

	@Override
	public ClienteModel save(ClienteModel cliente) {
		if (!clientes.contains(cliente)) {
			clientes.add(cliente);
			return cliente;
			}
			return null;

	}

	@Override
	public void edit(ClienteModel cliente) {
		int posicion = clientes.indexOf(cliente);
		if (posicion >= 0) {
			clientes.remove(posicion);
			clientes.add(cliente);
		}

		
	}

	@Override
	public void delete(ClienteModel cliente) {
		int posicion = clientes.indexOf(cliente);
		if (posicion >= 0) {
			clientes.remove(posicion);
		}

		
	}

	@Override
	public List<ClienteModel> getAll() {
		// TODO Auto-generated method stub
		return clientes;
	}


	@Override
	public ClienteDao save(ClienteDao cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void edit(ClienteDao cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ClienteDao cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ClienteModel get(String dni) {
		// TODO Auto-generated method stub
		return null;
	}





}
