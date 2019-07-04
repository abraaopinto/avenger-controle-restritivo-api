/**
 * 
 */
package com.avengercode.avenger.controle.retritivo.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.avengercode.avenger.controle.retritivo.domain.model.Pessoa;
import com.avengercode.avenger.controle.retritivo.repository.PessoaRepository;

/**
 * @author abraao
 * @size 2019-07-04
 * AvengersCode 
 */
@Component
public class PessoaManager {
	
	@Autowired
	private PessoaRepository repository;
	
	public List<Pessoa> getPessoas(){
		return (List<Pessoa>) this.repository.findAll();
	}
	
	public Pessoa incluirSalvar(Pessoa pessoa) {
		return this.repository.save(pessoa);
	}
	
	public void deletar(Pessoa pessoa) {
		this.repository.delete(pessoa);
	}

}
