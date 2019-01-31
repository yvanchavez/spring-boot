package com.warcenter.springboot.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.warcenter.springboot.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
