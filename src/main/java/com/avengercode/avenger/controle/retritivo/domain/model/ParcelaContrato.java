/**
 * 
 */
package com.avengercode.avenger.controle.retritivo.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author abraao
 * @size 2019-08-12
 * AvengersCode 
 */
@Entity
@Table(name="NCR_PARCELA_CONTRATO")
public class ParcelaContrato {
	
	@Id
	private ParcelaContratoPk idParcelaContratoPk;
	
	@Column(name="DT_VENCIMENTO")
	private LocalDateTime dataVencimento;
	
	@Column(name="DT_PAGAMENTO")
	private LocalDateTime dataPagamento;
	
	@Column(name="VL_PARCELA")
	private BigDecimal valorParcela;

}
