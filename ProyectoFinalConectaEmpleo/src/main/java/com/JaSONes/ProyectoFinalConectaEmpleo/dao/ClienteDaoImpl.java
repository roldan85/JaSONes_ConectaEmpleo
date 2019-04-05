package com.JaSONes.ProyectoFinalConectaEmpleo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.JaSONes.ProyectoFinalConectaEmpleo.model.Cliente;

@Repository
public class ClienteDaoImpl implements ClienteDao {
	
	private static List<ClienteDao> clientes;

	@Override
	public ClienteDao save(ClienteDao cliente) {
		if (!clientes.contains(cliente)) {
			clientes.add(cliente);
			return cliente;
			}
			return null;

	}

	@Override
	public void edit(ClienteDao cliente) {
		int posicion = clientes.indexOf(cliente);
		if (posicion >= 0) {
			clientes.remove(posicion);
			clientes.add(cliente);
		}
		
	}

	@Override
	public void delete(ClienteDao cliente) {
		int posicion = clientes.indexOf(cliente);
		if (posicion >= 0) {
			clientes.remove(posicion);
		}

		
	}

	@Override
	public List<ClienteDao> getAll() {

		return clientes;
	}

	@Override
	public Cliente get(int id) {
		int posicion = clientes.indexOf(ClienteDao(id, null, null));
		if (posicion >= 0)
			return (Cliente) clientes.get(posicion);
		else
			return null;

	}

	private Object ClienteDao(int id, Object object, Object object2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void edit(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

}
