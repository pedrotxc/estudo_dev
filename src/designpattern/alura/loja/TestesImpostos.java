package designpattern.alura.loja;

import java.math.BigDecimal;

import designpattern.alura.loja.imposto.CalculadoraDeImpostos;
import designpattern.alura.loja.imposto.ICMS;
import designpattern.alura.loja.orcamento.Orcamento;

public class TestesImpostos {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		System.out.println(calculadora.calcular(orcamento, new ICMS()));
	}
}
