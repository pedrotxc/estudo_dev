package designpattern.alura.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import designpattern.alura.loja.pedido.GeraPedido;
import designpattern.alura.loja.pedido.GeraPedidoHandler;
import designpattern.alura.loja.pedido.acao.EnviarEmailPedido;
import designpattern.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestesPedidos {
	public static void main(String[] args) {		
		
		String cliente = args[0];
		BigDecimal valorOrcamento = new BigDecimal(args[1]);
		int quantidadeItens = Integer.parseInt(args[2]);
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(new SalvarPedidoNoBancoDeDados(), new EnviarEmailPedido()));
		handler.executa(gerador);
	}
}
