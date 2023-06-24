package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {

	private BigDecimal valor;
	private Integer quantidadeItens;
	
	public Orcamento(BigDecimal valor, Integer quantidadeDeItens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeDeItens;
	}

	public BigDecimal getValor() {
		return valor;
	}
	
	public Integer getQuantidadeItens() {
		return quantidadeItens;
	}
}
