package com.designpattern.alura.strategy;

import java.math.BigDecimal;

public class Strategy_2 {
	public static void main(String[] args) {
		BigDecimal valor = new BigDecimal(10);
		Compra_2 compra_2 = new Compra_2(valor);
		
		compra_2.processarCompra(new pagamentoCartaoCredito_2());
	}
}


class Compra_2{
	BigDecimal valor;
	
	public Compra_2(BigDecimal valor){
		this.valor = valor;
	}
	
	void processarCompra(EstrategiaPagamento_2 estrategia) {
		estrategia.pagar(this);
	}
}

interface EstrategiaPagamento_2{
	void pagar(Compra_2 compra);
}

class pagamentoCartaoCredito_2 implements EstrategiaPagamento_2 {
	@Override
	public void pagar(Compra_2 compra_2) {
		System.out.println("Pagamento com crédito: " + compra_2.valor);
	}
}

class pagamentoCartaoDebito_2 implements EstrategiaPagamento_2 {
	@Override
	public void pagar(Compra_2 compra_2) {
		System.out.println("Pagamento com débito: " + compra_2.valor);
	}
}