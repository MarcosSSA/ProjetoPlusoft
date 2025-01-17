package com.ramos.crudplusoft.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ramos.crudplusoft.model.Pessoa;
import com.ramos.crudplusoft.servicos.PessoaServico;

@RestController
public class PessoaResource {
	
	@Autowired
	private PessoaServico pessoaServico;
	
	@RequestMapping(value = "/pessoas", method = RequestMethod.GET)	  
	public ResponseEntity<List<Pessoa>> listar(){	
		List<Pessoa> pessoa = pessoaServico.listar();
		return new ResponseEntity<List<Pessoa>>(pessoa, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/pessoas", method = RequestMethod.POST)
	public Pessoa adicionar(Pessoa p) {
		return pessoaServico.adicionar(p);
	}
}
