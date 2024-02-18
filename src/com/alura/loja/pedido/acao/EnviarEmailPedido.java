package com.alura.loja.pedido.acao;

import com.alura.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido{
	
	public void executarAcao(Pedido pedido) {
		System.out.println("Enviado email com dados do pedido!");
	}
}
