package strategy;

import java.math.BigDecimal;

public class Strategy_1 {
	public static void main(String[] args) {
		BigDecimal valor = new BigDecimal(10);
		Compra compra = new Compra(valor);
		
		compra.processarCompra(new pagamentoCartaoDebito());
	}
}

//Contexto
class Compra{
	private BigDecimal valor;
	
	public Compra(BigDecimal valor) {
		this.valor = valor;
	}
	
	void processarCompra(EstrategiaCompra estrategiaCompra) {
		estrategiaCompra.pagar(valor);
	}
}

//Estratégia - Interface
interface EstrategiaCompra {
	void pagar(BigDecimal valor);
}

//Estratégia - Concreta
class pagamentoCartaoCredito implements EstrategiaCompra{
	@Override
	public void pagar(BigDecimal valor) {
		System.out.println("Pagando com crédito: " + valor);
		
	}
}

//Estratégia - Concreta
class pagamentoCartaoDebito implements EstrategiaCompra{
	@Override
	public void pagar(BigDecimal valor) {
		System.out.println("Pagando com débito: " + valor);
	}
}