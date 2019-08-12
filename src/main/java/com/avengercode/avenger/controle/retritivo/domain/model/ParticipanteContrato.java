/**
 * 
 */
package com.avengercode.avenger.controle.retritivo.domain.model;

import java.io.Serializable;

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
	private ParticipanteContratoPk idParticipanteContratoPK;
	
	@ManyToOne
	private TipoParticipacao tipoPaticipacao;

	public ParticipanteContratoPk getIdParticipanteContratoPk() {
		return idParticipanteContratoPK;
	}
	
	public void setIdParticipanteContratoPk(ParticipanteContratoPk idParticipanteContratoPk) {
		this.idParticipanteContratoPK = idParticipanteContratoPk;
	}
	
	public TipoParticipacao getTipoPaticipacao() {
		return tipoPaticipacao;
	}

	public void setTipoPaticipacao(TipoParticipacao tipoPaticipacao) {
		this.tipoPaticipacao = tipoPaticipacao;
	}
}
