package model;

public class Telefone {
	
	private String ddd;
	private String numero;
	
	private Cliente cliente;
	final private int fk_cliente = cliente.getId_cliente();
	
	public Telefone(String ddd, String numero, Cliente cliente) {
		this.ddd = ddd;
		this.numero = numero;
		this.cliente = cliente;
	}
	
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getFk_cliente() {
		return fk_cliente;
	}
	
	
}
