/**
 * 
 */
package com.avengercode.avenger.controle.retritivo.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author abraao
 * @size 2019-08-10
 * AvengersCode 
 */
@Entity
@Table(name="NCR_TIPO_PARTICIPACAO")
public class TipoParticipacao {
	
	@Id
	@Column(name="ID_TIPO_PARTICIPACAO")
	private Long idTipoParticipacao;
	
	@Column(name="DS_TIPO_PARTICIPACAO")
	private String descricaoTipoParticipacao;

	public Long getIdTipoParticipacao() {
		return idTipoParticipacao;
	}

	public void setIdTipoParticipacao(Long idTipoParticipacao) {
		this.idTipoParticipacao = idTipoParticipacao;
	}

	public String getDescricaoTipoParticipacao() {
		return descricaoTipoParticipacao;
	}

	public void setDescricaoTipoParticipacao(String descricaoTipoParticipacao) {
		this.descricaoTipoParticipacao = descricaoTipoParticipacao;
	}

}
