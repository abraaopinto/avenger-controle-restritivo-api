/**
 * 
 */
package com.avengercode.avenger.controle.retritivo.domain.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author abraao
 * @size 2019-08-12
 * AvengersCode 
 */
@Embeddable
public class ParticipanteContratoPk implements Serializable{
	
	private static final long serialVersionUID = 7345532083413494846L;

	@Column(name="NR_CONTRATO")
	private String numeroContrato;
	
	@Column(name="ID_PESSOA")
	private Long idPessoa;

	public String getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(String numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public Long getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Long idPessoa) {
		this.idPessoa = idPessoa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idPessoa, numeroContrato);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParticipanteContratoPk other = (ParticipanteContratoPk) obj;
		return Objects.equals(idPessoa, other.idPessoa) && Objects.equals(numeroContrato, other.numeroContrato);
	}	
}
