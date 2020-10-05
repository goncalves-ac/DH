package br.escritorioacg.escritorio_acg.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.escritorioacg.escritorio_acg.entities.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
	
	Produto findOneByNome(String nome);
	List<Produto> findByNomeContaining(String nome);
	
	Produto findOneByEstoque(int estoque);

}
