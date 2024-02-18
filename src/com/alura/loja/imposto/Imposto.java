package com.alura.loja.imposto;

import java.math.BigDecimal;

import com.alura.loja.orcamento.Orcamento;

public interface Imposto {
	
	BigDecimal calcular(Orcamento orcamento);
	
}
