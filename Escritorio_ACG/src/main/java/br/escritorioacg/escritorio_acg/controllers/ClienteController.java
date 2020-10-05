package br.escritorioacg.escritorio_acg.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.escritorioacg.escritorio_acg.entities.Cliente;
import br.escritorioacg.escritorio_acg.repositories.ClienteRepository;


@RestController
@RequestMapping(path = "cliente")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;

	@GetMapping()
	public Iterable<Cliente> getClientes(){
		return clienteRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Cliente> getById(@PathVariable int id){
		return clienteRepository.findById(id);
	}
	
	@GetMapping("/nome")
	public Cliente getByName(@RequestParam String nome) {
		return clienteRepository.findOneByNome(nome);
	}
	
	@GetMapping("/nomelike")
	public List<Cliente> getByNameLike(@RequestParam String nome) {
		return clienteRepository.findByNomeContaining(nome);
	}
	
	@GetMapping("cpflike")
	public List<Cliente> getByCpfLike(@RequestParam String cpf){
		return clienteRepository.findByCpfContaining(cpf);
	}
	
	@PostMapping()
	public Cliente addCliente(@RequestBody Cliente cliente) {
		clienteRepository.save(cliente);
		return cliente;
	}
	
	@PutMapping("/{idCliente}")
	public Cliente updateCliente(@PathVariable int idCliente, @RequestBody Cliente dadosCliente) throws Exception {
		Cliente meuCliente = clienteRepository.findById(idCliente)
		.orElseThrow(() -> new IllegalAccessException());
		
		if(!dadosCliente.getCpf().isEmpty()) meuCliente.setCpf(dadosCliente.getCpf());
		if(!dadosCliente.getNome().isEmpty()) meuCliente.setNome(dadosCliente.getNome());
		
		clienteRepository.save(meuCliente);
		return meuCliente;
	}
	
	@DeleteMapping("/{id}")
	public void deleteCliente(@PathVariable int id) {
		clienteRepository.deleteById(id);
	}

}
