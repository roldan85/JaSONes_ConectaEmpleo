package com.JaSONes.ProyectoFinalConectaEmpleo.dao;

import java.util.List;

import com.JaSONes.ProyectoFinalConectaEmpleo.model.ClienteModel;

public interface ClienteDao {
	
	public ClienteModel save(ClienteModel cliente);

	public void edit(ClienteModel cliente);

	public void delete(ClienteModel cliente);

	public List<ClienteModel> getAll();


	ClienteDao save(ClienteDao cliente);

	void edit(ClienteDao cliente);

	void delete(ClienteDao cliente);

	ClienteModel get(String dni);

}
