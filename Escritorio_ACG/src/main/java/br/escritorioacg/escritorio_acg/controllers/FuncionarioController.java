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

import br.escritorioacg.escritorio_acg.entities.Funcionario;
import br.escritorioacg.escritorio_acg.repositories.FuncionarioRepository;

@RestController
@RequestMapping(path= "funcionario")
public class FuncionarioController {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;

	@GetMapping()
	public Iterable<Funcionario> getClientes(){
		return funcionarioRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Funcionario> getById(@PathVariable int id){
		return funcionarioRepository.findById(id);
	}
	
	@GetMapping("/nome")
	public Funcionario getByName(@RequestParam String nome) {
		return funcionarioRepository.findOneByNome(nome);
	}
	
	@GetMapping("/nomelike")
	public List<Funcionario> getByNameLike(@RequestParam String nome) {
		return funcionarioRepository.findByNomeContaining(nome);
	}
	
	@GetMapping("cpflike")
	public List<Funcionario> getByCpfLike(@RequestParam String cpf){
		return funcionarioRepository.findByCpfContaining(cpf);
	}
	
	@PostMapping()
	public Funcionario addCliente(@RequestBody Funcionario cliente) {
		funcionarioRepository.save(cliente);
		return cliente;
	}
	
	@PutMapping("/{idCliente}")
	public Funcionario updateCliente(@PathVariable int idCliente, @RequestBody Funcionario dadosCliente) throws Exception {
		Funcionario meuCliente = funcionarioRepository.findById(idCliente)
		.orElseThrow(() -> new IllegalAccessException());
		
		if(!dadosCliente.getCpf().isEmpty()) meuCliente.setCpf(dadosCliente.getCpf());
		if(!dadosCliente.getNome().isEmpty()) meuCliente.setNome(dadosCliente.getNome());
		
		funcionarioRepository.save(meuCliente);
		return meuCliente;
	}
	
	@DeleteMapping("/{id}")
	public void deleteCliente(@PathVariable int id) {
		funcionarioRepository.deleteById(id);
	}
	
}
