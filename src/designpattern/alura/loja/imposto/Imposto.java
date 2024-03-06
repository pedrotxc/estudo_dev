package designpattern.alura.loja.imposto;

import java.math.BigDecimal;

import designpattern.alura.loja.orcamento.Orcamento;

public interface Imposto {
	
	BigDecimal calcular(Orcamento orcamento);
	
}
