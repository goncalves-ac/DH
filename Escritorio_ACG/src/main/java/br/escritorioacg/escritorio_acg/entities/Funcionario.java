package br.escritorioacg.escritorio_acg.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_funcionario;
	
	private String nome;
	private String cpf;
	private String funcao;
	
	public Funcionario () {}
	
	public Funcionario(String nome, String cpf, String funcao) {
		this.nome = nome;
		this.cpf = cpf;
		this.funcao = funcao;
	}

	public int getId() {
		return id_funcionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getFuncao() {
		return funcao;
	}

	public void setfuncao(String funcao) {
		this.funcao = funcao;
	}
}
