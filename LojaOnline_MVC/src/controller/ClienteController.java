package controller;

import java.time.LocalDate;

import model.Cliente;
import view.ClienteView;

public class ClienteController {
	
	private Cliente model;
	private ClienteView view;
	
	public ClienteController(Cliente model, ClienteView view) {
		this.model = model;
		this.view = view;
	}
	
	public int getClienteId_cliente() {
		return model.getId_cliente();
	}
	public String getClienteNome() {
		return model.getNome();
	}
	public void setClienteNome(String nome) {
		model.setNome(nome);
	}
	public String getClienteCpf() {
		return model.getCpf();
	}
	public void setClienteCpf(String cpf) {
		model.setCpf(cpf);
	}
	public String getClienteRg() {
		return model.getRg();
	}
	public void setClienteRg(String rg) {
		model.setRg(rg);
	}
	public String getClienteEmail() {
		return model.getEmail();
	}
	public void setClienteEmail(String email) {
		model.setEmail(email);
	}
	public LocalDate getClienteNascimento() {
		return model.getNascimento();
	}
	public void setClienteNascimento(LocalDate nascimento) {
		model.setNascimento(nascimento);
	}
	public void updateView() {
		view.printClienteDetails (model.getId_cliente(), model.getNome(), model.getNascimento(), model.getCpf(), model.getRg(), model.getEmail());
	}
}
