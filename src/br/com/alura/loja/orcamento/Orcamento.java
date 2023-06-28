package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {

	private BigDecimal valor;
	private Integer quantidadeItens;
	private SituacaoOrcamento situacao;
	
	public Orcamento(BigDecimal valor, Integer quantidadeDeItens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeDeItens;
	}

	public void aplicarDescontoExtra() {
		BigDecimal valorDoDescontoExtra = BigDecimal.ZERO;
		if(situacao.equals("EM ANALISE")) {
			valorDoDescontoExtra = new BigDecimal("0.5");
		}else if(situacao.equals("APROVADO")) {
			valorDoDescontoExtra = new BigDecimal("0.02");
		}
				
		this.valor = this.valor.subtract(valorDoDescontoExtra);
	}
	
	
	public BigDecimal getValor() {
		return valor;
	}
	
	public Integer getQuantidadeItens() {
		return quantidadeItens;
	}
	
	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}
}
