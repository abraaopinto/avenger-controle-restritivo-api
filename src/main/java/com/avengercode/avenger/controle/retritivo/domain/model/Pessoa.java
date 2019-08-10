/**
 * 
 */
package com.avengercode.avenger.controle.retritivo.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.avengercode.avenger.controle.retritivo.domain.enums.TipoPessoaEnum;

/**
 * @author Abraao Pinto
 * @size 2019-07-04
 * AvengersCode 
 */
@Entity
@Table(name="NCR_PESSOA")
public class Pessoa {
	
	@Id
	@Column(name="ID_PESSOA")
	private Long idPessoa;
	
	@Column(name="ID_FISCAL")
	private String idFiscal;
	
	@Column(name="NOME")
	private String nome;
	
	@Enumerated(EnumType.STRING)
	@Column(name="TP_PESSOA")
	private TipoPessoaEnum tipoPessoa;

	public Long getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Long idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getIdFiscal() {
		return idFiscal;
	}

	public void setIdFiscal(String idFiscal) {
		this.idFiscal = idFiscal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoPessoaEnum getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoaEnum tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
}
