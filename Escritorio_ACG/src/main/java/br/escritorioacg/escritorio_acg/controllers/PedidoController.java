package br.escritorioacg.escritorio_acg.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.escritorioacg.escritorio_acg.entities.Pedido;
import br.escritorioacg.escritorio_acg.repositories.PedidoRepository;

@RestController
@RequestMapping(path = "/pedido")
public class PedidoController {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping
	public Iterable<Pedido> getPedidos(){
		return pedidoRepository.findAll();
	}
	
	@PostMapping()
	public Pedido postProdutos(@RequestBody Pedido pedido) {
		pedidoRepository.save(pedido);
		return pedido;
	}

}
