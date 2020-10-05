package br.escritorioacg.escritorio_acg.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.escritorioacg.escritorio_acg.entities.Pedido;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, String> {

}
