package com.ramos.crudplusoft.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ramos.crudplusoft.model.Pessoa;
import com.ramos.crudplusoft.repository.PessoaRepository;

public class PessoaServicoImp implements PessoaServico{
	
	@Autowired
	private PessoaRepository repositorio;

	@Override
	public List<Pessoa> listar() {
		return repositorio.findAll();
	}

	@Override
	public Pessoa buscarPessoa(int id) {
		return null;
	}

	@Override
	public Pessoa adicionar(Pessoa p) {
		return null;
	}

	@Override
	public Pessoa editar(Pessoa p) {
		return null;
	}

	@Override
	public Pessoa deletar(int id) {
		return null;
	}
}
