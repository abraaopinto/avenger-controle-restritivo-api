/**
 * 
 */
package com.avengercode.avenger.controle.retritivo.domain.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Abraao Pinto
 * @size 2019-08-10
 * AvengersCode 
 */
@Entity
@Table(name="NCR_CONTRATO")
public class Contrato {
	
	@Id
	@Column(name="NR_CONTRATO")
	private String numeroContrato;
	
	@Column(name="VL_CONTRATADO")
	private BigDecimal valorContratado;

	public String getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(String numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public BigDecimal getValorContratado() {
		return valorContratado;
	}

	public void setValorContratado(BigDecimal valorContratado) {
		this.valorContratado = valorContratado;
	}
}
