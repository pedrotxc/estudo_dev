package designpattern.alura.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import designpattern.alura.loja.orcamento.Orcamento;
import designpattern.alura.loja.pedido.acao.AcaoAposGerarPedido;

public class GeraPedidoHandler {

	private List<AcaoAposGerarPedido> acoes;

	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}

	public void executa(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		acoes.forEach(a -> a.executarAcao(pedido));
	}

}
