package br.edu.utfpr.td.tsi.ecommerce.web.produtos;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin
@RequestMapping("/produtos")
public class ProdutosEndpoint {
	
	@Autowired
	private ProdutosRepository repository;
	

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> carregarCatalogo() {
		List<Produto> produtos = repository.findAll();
		System.out.println(produtos.toString());
		return ResponseEntity.status(HttpStatus.OK).body(produtos);
	}
	
}
