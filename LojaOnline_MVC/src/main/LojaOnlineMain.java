package main;

import java.time.LocalDate;

// Cliente
import controller.ClienteController;
import model.Cliente;
import view.ClienteView;

// Endereço
import controller.EnderecoController;
import model.Endereco;
import view.EnderecoView;

public class LojaOnlineMain {
	
	public static void main(String[] args) {
		//Cliente
		Cliente model = new Cliente();
		ClienteView view = new ClienteView();
		ClienteController controller = new ClienteController(model, view);
		LocalDate data = LocalDate.of(1989, 11, 30);
		
		//Endereço Cliente
		Endereco endModel = new Endereco();
		EnderecoView endView = new EnderecoView();
		EnderecoController endController = new EnderecoController(endModel, endView);
		
		//Setando Cliente
		controller.setClienteNome("Ana Carol");
		controller.setClienteRg("MG 16965210");
		controller.setClienteCpf("093.201.036-90");
		controller.setClienteNascimento(data);
		controller.setClienteEmail("acg@acg.com");
		
		//Setando endereco Cliente
		endController.setEnderecoCidade("BH");
		
		//Printando
		controller.updateView();
	}
}
