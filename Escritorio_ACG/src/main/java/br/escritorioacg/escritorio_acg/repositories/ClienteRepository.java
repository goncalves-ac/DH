package br.escritorioacg.escritorio_acg.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.escritorioacg.escritorio_acg.entities.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer>{

	Cliente findOneByNome(String nome);
	List<Cliente> findByNomeContaining(String nome);
	List<Cliente> findByCpfContaining(String cpf);
	
}
