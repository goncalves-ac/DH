package view;

public class Produto_PedidoView {
	
	public void printPedidoDetails (int fk_pedido, int fk_produto, int quantidade_produto) {
		
		System.out.println("Produto_Pedido: ");
		System.out.println("FK Pedido: " + fk_pedido);
		System.out.println("FK Produto: " + fk_produto);
		System.out.println("Quantidade produto: " + quantidade_produto);
		
	}
	
}
