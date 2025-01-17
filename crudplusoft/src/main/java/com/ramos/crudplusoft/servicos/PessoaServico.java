package com.ramos.crudplusoft.servicos;

import java.util.List;

import com.ramos.crudplusoft.model.Pessoa;

public interface PessoaServico {	
	List<Pessoa> listar();
	
	Pessoa buscarPessoa(int id);
	
	Pessoa adicionar(Pessoa p);
	
	Pessoa editar(Pessoa p);
	
	Pessoa deletar(int id);
}
