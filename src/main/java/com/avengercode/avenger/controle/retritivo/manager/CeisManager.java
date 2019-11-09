/**
 * 
 */
package com.avengercode.avenger.controle.retritivo.manager;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Abraão Pinto
 * 2019-10-17
 */
@Component
public class CeisManager {
	
	private final static String URL_BASE = "http://www.transparencia.gov.br";
	private final static String METODO = "/api-de-dados/ceis?";
	private final static String PARAMETRO_CODIGO_SANCIONADO = "codigoSancionado=";
	private final static String PARAMETRO_PAGINA = "&pagina=";
	private final static String PARAMETRO_NUMERO_DE_PAGINAS = "1";
	
	
	public boolean getCeisPorIdFiscal(String idFiscal) {
		return getCeis(idFiscal) != null;
	}
	
	private Pessoa getCeis(String idFiscal) {
		RestTemplate restTemplate = new RestTemplate();
		
		Pessoa pessoa = restTemplate.getForObject(URL_BASE+METODO+PARAMETRO_CODIGO_SANCIONADO+idFiscal+PARAMETRO_PAGINA+PARAMETRO_NUMERO_DE_PAGINAS, Pessoa.class);
		
		return pessoa;
	}
	
	protected class Pessoa {
		
		private String codigoFormatado;
		
	    public String getCodigoFormatado() {
			return codigoFormatado;
		}
		
		public void setCodigoFormatado(String codigoFormatado) {
			this.codigoFormatado = codigoFormatado;
		}
	}
}
