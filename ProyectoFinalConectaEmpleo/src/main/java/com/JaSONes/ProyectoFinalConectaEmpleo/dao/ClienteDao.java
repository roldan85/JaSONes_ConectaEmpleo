package com.JaSONes.ProyectoFinalConectaEmpleo.dao;

import java.util.List;

import com.JaSONes.ProyectoFinalConectaEmpleo.model.Cliente;

public interface ClienteDao {
	
	public Cliente save(Cliente cliente);

	public void edit(Cliente cliente);

	public void delete(Cliente cliente);

	public List<ClienteDao> getAll();

	public Cliente get(int id);

	ClienteDao save(ClienteDao cliente);

	void edit(ClienteDao cliente);

	void delete(ClienteDao cliente);

}
