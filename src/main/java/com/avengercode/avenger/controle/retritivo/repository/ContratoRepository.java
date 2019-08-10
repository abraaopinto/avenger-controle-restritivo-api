/**
 * 
 */
package com.avengercode.avenger.controle.retritivo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.avengercode.avenger.controle.retritivo.domain.model.Contrato;

/**
 * @author Abraao Pinto
 * @size 2019-08-10
 * AvengersCode 
 */
@Repository
public interface ContratoRepository extends CrudRepository<Contrato, String> {

}
