/**
 * 
 */
package com.avengercode.avenger.controle.retritivo.domain.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Abraao Pinto
 * @size 2019-08-10
 * AvengersCode 
 */
@Entity
@Table(name="NCR_PARTICIPANTE_CONTRATO")
public class ParticipanteContrato implements Serializable  {
	
	private static final long serialVersionUID = -4730383613480022142L;

	@Id
	@Column(name="NR_CONTRATO")
	private String numeroContrato;
	
	@Id
	@Column(name="ID_PESSOA")
	private Long idPessoa;
	
	@ManyToOne
	private TipoParticipacao tipoPaticipacao;

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

	public TipoParticipacao getTipoPaticipacao() {
		return tipoPaticipacao;
	}

	public void setTipoPaticipacao(TipoParticipacao tipoPaticipacao) {
		this.tipoPaticipacao = tipoPaticipacao;
	}

}
