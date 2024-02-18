package com.designpattern.alura.strategy;

import java.math.BigDecimal;

public class Strategy_3 {
	public static void main(String[] args) {
		BigDecimal valor = new BigDecimal(10);
		Compra_3 compra_3 = new Compra_3(valor);
		compra_3.processarCompra(new pagamentoCartaoCredito_3());
	}
}


class Compra_3 implements Pagavel_3{
	BigDecimal valor;
	
	public Compra_3(BigDecimal valor) {
		this.valor = valor;
	}
	
	void processarCompra(EstrategiaPagamento_3 estrategiaPagamento) {
		estrategiaPagamento.pagar(this);
	}

	@Override
	public BigDecimal getValor() {
		return this.valor;
	}
	
}

interface Pagavel_3 {
	BigDecimal getValor();
}

interface EstrategiaPagamento_3{
	void pagar(Pagavel_3 pagavel_3);
}

class pagamentoCartaoCredito_3 implements EstrategiaPagamento_3{
	@Override
	public void pagar(Pagavel_3 pagavel_3) {
		System.out.println("Pagamento com crédito: " + pagavel_3.getValor());
	}
}

class pagamentoCartaoDebito_3 implements EstrategiaPagamento_3{
	@Override
	public void pagar(Pagavel_3 pagavel_3) {
		System.out.println("Pagamento com débito: " + pagavel_3.getValor());
	}
}