package view;

import java.time.LocalDate;

public class ClienteView {
	
	public void printClienteDetails (int id_cliente, String nome, LocalDate nascimento, String cpf, String rg, String email) {
		
		System.out.println("\tCliente ");
		System.out.println("Nome: " + nome);
		System.out.println("Data de nascimento: " + nascimento);
		System.out.println("CPF: " + cpf);
		System.out.println("RG: " + rg);
		System.out.println("E-mail: " + email);
		
	}
	
}
