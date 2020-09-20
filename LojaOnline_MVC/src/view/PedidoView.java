package view;

import java.time.LocalDate;

public class PedidoView {
	
	public void printPedidoDetails (String nfe, LocalDate data_emissao, double valor_total, String status_pedido) {
		
		System.out.println("Pedido: ");
		System.out.println("NFE: " + nfe);
		System.out.println("Data de Emissão: " + data_emissao);
		System.out.println("Valor Total: " + valor_total);
		System.out.println("Status do Pedido: " + status_pedido);
		
	}
	
}
