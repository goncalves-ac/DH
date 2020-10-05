package br.escritorioacg.escritorio_acg.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.escritorioacg.escritorio_acg.entities.Funcionario;

@Repository
public interface FuncionarioRepository extends CrudRepository<Funcionario, Integer>{
	
	Funcionario findOneByNome(String nome);
	List<Funcionario> findByNomeContaining(String nome);
	List<Funcionario> findByCpfContaining(String cpf);
	
}
