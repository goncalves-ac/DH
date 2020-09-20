package model;

public class Produto_Pedido {
	
	private Produto produto;
	final private int fk_produto = produto.getId_produto();
	
	private Pedido pedido;
	final private int fk_pedido = pedido.getId_pedido();
	
	private int quantidade_produto;
	
	public Produto_Pedido(Produto produto, Pedido pedido, int quantidade_produto) {
		this.produto = produto;
		this.pedido = pedido;
		this.quantidade_produto = quantidade_produto;
	}
	
	public int getQuantidade_produto() {
		return quantidade_produto;
	}
	public void setQuantidade_produto(int quantidade_produto) {
		this.quantidade_produto = quantidade_produto;
	}
	public int getFk_produto() {
		return fk_produto;
	}
	public int getFk_pedido() {
		return fk_pedido;
	}
	
}
