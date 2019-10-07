package com.ramos.crudplusoft.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.ramos.crudplusoft.model.Pessoa;

public interface PessoaRepository extends Repository<Pessoa, Integer>{
	
	List<Pessoa> findAll();
	
	Pessoa findOne(int id);
	
	Pessoa save(Pessoa p);
	
	void delete(Pessoa p);

}