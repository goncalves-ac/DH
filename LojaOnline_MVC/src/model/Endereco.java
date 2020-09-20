package model;

public class Endereco {
	
	private int numero;
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	private String complemento;
	
	private Cliente cliente;
	final private int fk_cliente = cliente.getId_cliente();
	
	public Endereco(int numero, String rua, String bairro, String cidade, String estado, String complemento,
			Cliente cliente) {
		this.numero = numero;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.complemento = complemento;
		this.cliente = cliente;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String completo) {
		this.complemento = completo;
	}
	
	public int getFk_cliente() {
		return fk_cliente;
	}	

}
