package model;

public class Produto {
	
	private int id_produto;
	private String nome_produto;
	private String descricao;
	private double preco;
	
	public Produto(int id_produto, String nome_produto, String descricao, double preco) {
		this.id_produto = id_produto;
		this.nome_produto = nome_produto;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public int getId_produto() {
		return id_produto;
	}
	public String getNome_produto() {
		return nome_produto;
	}
	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
