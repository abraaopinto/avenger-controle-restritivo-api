/**
 * 
 */
package com.avengercode.avenger.controle.retritivo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.avengercode.avenger.controle.retritivo.domain.model.Pessoa;

/**
 * @author abraao
 * @size 2019-07-04
 * AvengersCode 
 */
@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Long> {
	
}
