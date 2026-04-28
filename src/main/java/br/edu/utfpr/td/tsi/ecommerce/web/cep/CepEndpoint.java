package br.edu.utfpr.td.tsi.ecommerce.web.cep;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin
@RequestMapping("/cep")
public class CepEndpoint {
	
	 private final RestTemplate restTemplate = new RestTemplate();

	    public ViaCepResponse buscarCep(String cep) {
	        String url = "https://viacep.com.br/ws/" + cep + "/json/";

	        return restTemplate.getForObject(url, ViaCepResponse.class);
	    }
	    
	    public EnderecoDTO buscarEndereco(String cep) {
	        ViaCepResponse response = buscarCep(cep);
	        return new EnderecoDTO(response);
	    }
	 
	    @GetMapping("/{cep}")
	    public ResponseEntity<?> buscar(@PathVariable String cep) {
	        return ResponseEntity.status(HttpStatus.OK).body(buscarEndereco(cep));
	    }

}
