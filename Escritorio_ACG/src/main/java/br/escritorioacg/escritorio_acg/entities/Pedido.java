package br.escritorioacg.escritorio_acg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pedido {
	@Id
	private String nfe;
	@Column(name = "data_emissao")
	private String dataEmissao;
	@Column(name = "valor_total")
	private double valorTotal;
	@Column(name = "status_pedido")
	private String statusPedido;
	@ManyToOne
	@JoinColumn(name = "fk_cliente")
	private Cliente cliente;
	
	public String getNfe() {
		return nfe;
	}
	public String setNfe(String nfe) {
		return this.nfe = nfe;
	}
	public String getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getStatusPedido() {
		return statusPedido;
	}
	public void setStatusPedido(String statusPedido) {
		this.statusPedido = statusPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
