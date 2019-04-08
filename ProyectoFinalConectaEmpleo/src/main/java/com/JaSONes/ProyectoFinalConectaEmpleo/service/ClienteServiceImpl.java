package com.JaSONes.ProyectoFinalConectaEmpleo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JaSONes.ProyectoFinalConectaEmpleo.dao.ClienteDao;
import com.JaSONes.ProyectoFinalConectaEmpleo.model.Cliente;

@Service("clienteService")
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	ClienteDao clienteDao;

	@Override
	public Cliente save(Cliente cliente) {

		return this.clienteDao.save(cliente);
	}

	@Override
	public void edit(Cliente cliente) {
		this.clienteDao.edit(cliente);
		
	}

	@Override
	public void delete(Cliente cliente) {
		this.clienteDao.delete(cliente);
		
	}

	@Override
	public List<Cliente> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
