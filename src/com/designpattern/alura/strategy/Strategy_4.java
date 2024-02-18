package com.designpattern.alura.strategy;

import java.math.BigDecimal;

public class Strategy_4 {
	public static void main(String[] args) {
		BigDecimal valor = new BigDecimal("10");
		Compra_4 compra_4 = new Compra_4(valor);
		
		compra_4.processarCompra(v -> System.out.println("Pagou no crédito: " + valor));
	}
}

class Compra_4{
	BigDecimal valor;
	
	public Compra_4(BigDecimal valor) {
		this.valor = valor;
	}
	
	void processarCompra(EstrategiaPagamento_4 estrategiaPagamento_4) {
		estrategiaPagamento_4.pagar(this.valor);
	}
}

interface EstrategiaPagamento_4 {
	void pagar(BigDecimal valor);
}