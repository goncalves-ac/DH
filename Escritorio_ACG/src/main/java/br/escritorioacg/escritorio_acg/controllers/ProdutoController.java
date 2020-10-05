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

import br.escritorioacg.escritorio_acg.entities.Produto;
import br.escritorioacg.escritorio_acg.repositories.ProdutoRepository;

@RestController
@RequestMapping(path = "/produto")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	

	@GetMapping()
	public Iterable<Produto> getProdutos(){
		return produtoRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Produto> getById(@PathVariable int id){
		return produtoRepository.findById(id);
	}
	
	@GetMapping("/nome")
	public Produto getByName(@RequestParam String nome) {
		return produtoRepository.findOneByNome(nome);
	}
	
	@GetMapping("/nomelike")
	public List<Produto> getByNameLike(@RequestParam String nome) {
		return produtoRepository.findByNomeContaining(nome);
	}
	
	@GetMapping("/estoque")
	public Produto getByEstoque(@RequestParam int estoque) {
		return produtoRepository.findOneByEstoque(estoque);
	}
	
	@GetMapping("/decada")
	public List<Produto> getByDecadaLike(@RequestParam String decada) {
		return produtoRepository.findByNomeContaining(decada);
	}
	
	@PostMapping()
	public void postProduto(@RequestBody Produto produto) {
		produtoRepository.save(produto);
	}
	
	@PutMapping("/{idProduto}")
	public Produto updateProduto(@PathVariable int idProduto, @RequestBody Produto dadosProduto) throws Exception {
		Produto meuProduto = produtoRepository.findById(idProduto)
		.orElseThrow(() -> new IllegalAccessException());
		
		if(!dadosProduto.getNome().isEmpty()) meuProduto.setNome(dadosProduto.getNome());
		if(!dadosProduto.getDescricao().isEmpty()) meuProduto.setDescricao(dadosProduto.getDescricao());
//		if(!dadosProduto.getEstoque().isEmpty) meuProduto.setEstoque(dadosProduto.getEstoque());
//		if(!dadosProduto.getPreco().isEmpty) meuProduto.setPreco(dadosProduto.getPreco());
		
		produtoRepository.save(meuProduto);
		return meuProduto;
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduto(@PathVariable int id) {
		produtoRepository.deleteById(id);
	}
}
