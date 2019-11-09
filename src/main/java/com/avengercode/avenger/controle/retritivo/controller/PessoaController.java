/**
 * 
 */
package com.avengercode.avenger.controle.retritivo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avengercode.avenger.controle.retritivo.domain.model.Pessoa;
import com.avengercode.avenger.controle.retritivo.manager.PessoaManager;

/**
 * @author abraao
 * @size 2019-07-04
 * AvengersCode 
 */
@CrossOrigin
@RestController
@RequestMapping(path = "pessoa")
public class PessoaController {
	
	@Autowired
	private PessoaManager pessoaManager;
	
	@GetMapping("listar")
	public List<Pessoa> getPessoas(){
		return pessoaManager.getPessoas();
	}
	
	@PostMapping
	public Pessoa incluirPessoa(@RequestBody Pessoa pessoa) {
		return pessoaManager.incluirSalvar(pessoa);
	}

	@PutMapping
	public Pessoa atualizarPessoa(@RequestBody Pessoa pessoa) {
		return pessoaManager.incluirSalvar(pessoa);
	}
	
	@DeleteMapping
	public void deletar(@RequestBody Pessoa pessoa) {
		pessoaManager.deletar(pessoa);
	}
}
