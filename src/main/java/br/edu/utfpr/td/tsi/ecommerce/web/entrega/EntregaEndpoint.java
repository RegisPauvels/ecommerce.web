package br.edu.utfpr.td.tsi.ecommerce.web.entrega;

import java.util.UUID;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/entrega")
public class EntregaEndpoint {

	public EntregaResponse criarEntrega() {

        System.out.println("Criando entrega...");

        EntregaResponse response = new EntregaResponse();
        response.setCodigoRastreio("BR-" + UUID.randomUUID().toString().substring(0,8));
        response.setStatus("Em preparação");

        return response;
    }
	
    @PostMapping
    public EntregaResponse criar() {
        return criarEntrega();
    }
}
