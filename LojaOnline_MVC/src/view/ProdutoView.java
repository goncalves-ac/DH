package view;

public class ProdutoView {
	
	public void printProdutoDetails (int id_produto, String nome_produto, String descricao, double preco) {
		
		System.out.println("Produto: ");
		System.out.println("ID Produto: " + id_produto);
		System.out.println("Nome Produto: " + nome_produto);
		System.out.println("Descri��o: " + descricao);
		System.out.println("Pre�o: R$ " + preco);
		
	}
}
