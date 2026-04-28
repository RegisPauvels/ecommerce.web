package br.edu.utfpr.td.tsi.ecommerce.web.fiscal;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/fiscal")
public class NotaFiscalEndpoint {
	
	public NotaFiscalResponse gerarNota() {

        System.out.println("🧾 Gerando nota fiscal...");

        NotaFiscalResponse response = new NotaFiscalResponse();
        response.setNumeroNota(UUID.randomUUID().toString());
        response.setMensagem("Nota fiscal gerada com sucesso");

        return response;
    }
	
	@PostMapping
    public ResponseEntity<?> gerar() {
        return ResponseEntity.status(HttpStatus.OK).body(gerarNota());
    }
}
