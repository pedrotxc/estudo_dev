package designpattern.alura.loja.pedido.acao;

import designpattern.alura.loja.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido{
	
	public void executarAcao(Pedido pedido) {
		System.out.println("Salvando pedido no banco de dados!");
	}
}
