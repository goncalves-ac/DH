package controller;

import model.Produto_Pedido;
import view.Produto_PedidoView;

public class Produto_PedidoController {
	
	private Produto_Pedido model;
	private Produto_PedidoView view;
	
	public Produto_PedidoController(Produto_Pedido model, Produto_PedidoView view) {
		this.model = model;
		this.view = view;
	}
	
	public int getProduto_PedidoQuantidade_produto() {
		return model.getQuantidade_produto();
	}
	public void setProduto_PedidoQuantidade_produto(int quantidade_produto) {
		model.setQuantidade_produto(quantidade_produto);
	}
	public int getProduto_PedidoFk_produto() {
		return model.getFk_produto();
	}
	public int getProduto_PedidoFk_pedido() {
		return model.getFk_pedido();
	}
	
	public void updadeView() {
		view.printPedidoDetails(model.getFk_pedido(), model.getFk_produto(), model.getQuantidade_produto());
	}
}
