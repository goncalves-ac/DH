package controller;

import model.Produto;
import view.ProdutoView;

public class ProdutoController {
	
	private Produto model;
	private ProdutoView view;
	
	public ProdutoController (Produto model, ProdutoView view) {
		this.model = model;
		this.view = view;
	}
	
	public int getProdutoId_produto() {
		return model.getId_produto();
	}
	public String getProdutoNome_produto() {
		return model.getNome_produto();
	}
	public void setProdutoNome_produto(String nome_produto) {
		model.setNome_produto(nome_produto);
	}
	public String getProdutoDescricao() {
		return model.getDescricao();
	}
	public void setProdutoDescricao(String descricao) {
		model.setDescricao(descricao);
	}
	public double getProdutoPreco() {
		return model.getPreco();
	}
	public void setProdutoPreco(double preco) {
		model.setPreco(preco);
	}
	
	public void updateView() {
		view.printProdutoDetails(model.getId_produto(), model.getNome_produto(), model.getDescricao(), model.getPreco());
	}
}
