package com.JaSONes.ProyectoFinalConectaEmpleo.service;

import java.util.List;

import com.JaSONes.ProyectoFinalConectaEmpleo.model.Cliente;

public interface ClienteService {
	
	public Cliente save(Cliente cliente);
	public void edit(Cliente cliente);
	public void delete(Cliente cliente);
	public List<Cliente> getAll();


}
