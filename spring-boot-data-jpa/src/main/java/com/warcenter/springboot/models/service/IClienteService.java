package com.warcenter.springboot.models.service;

import java.util.List;
import java.util.Optional;

import com.warcenter.springboot.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	public void save(Cliente cliente);
	public Optional<Cliente> findOne(Long id);
	public void delete(Long id);

}
