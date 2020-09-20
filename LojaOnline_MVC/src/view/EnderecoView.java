package view;

public class EnderecoView {
	
	public void printEnderecoDetails (int numero, String rua, String bairro, String cidade, String estado, String complemento) {
		
		System.out.println("Endereço: ");
		System.out.println("Rua: " + rua);
		System.out.println("Numero: " + numero);
		System.out.println("Complemento: " + complemento);
		System.out.println("Bairro: " + bairro);
		System.out.println("Cidade: " + cidade);
		System.out.println("Estado: " + estado);
		
	}
	
}
