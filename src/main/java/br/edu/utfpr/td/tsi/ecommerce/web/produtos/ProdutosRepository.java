package br.edu.utfpr.td.tsi.ecommerce.web.produtos;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProdutosRepository extends MongoRepository<Produto, String>{

}
