/**
 * 
 */
package com.avengercode.avenger.controle.retritivo.domain.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author abraao
 * @size 2019-08-12
 * AvengersCode 
 */
@Embeddable
public class ParcelaContratoPk implements Serializable {

	private static final long serialVersionUID = 1157966871046237287L;
	
	@Column(name="NR_PARCELA")
	private Long numeroParcela;

	@Column(name="NR_CONTRATO")
	private String numeroContrato;

	public Long getNumeroParcela() {
		return numeroParcela;
	}
	
	public void setNumeroParcela(Long numeroParcela) {
		this.numeroParcela = numeroParcela;
	}

	public String getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(String numeroContrato) {
		this.numeroContrato = numeroContrato;
	}	
}
