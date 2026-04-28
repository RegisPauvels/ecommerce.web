package br.edu.utfpr.td.tsi.ecommerce.web.pagamento;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
@RequestMapping("/pagamento")
public class PagamentoEndpoint {
	
	public PagamentoResponse processar(PagamentoRequest request) {

        System.out.println("💳 Processando pagamento...");

        PagamentoResponse response = new PagamentoResponse();

        boolean sucesso = Math.random() > 0.2;

        if (sucesso) {
            response.setAprovado(true);
            response.setMensagem("Pagamento aprovado");
        } else {
            response.setAprovado(false);
            response.setMensagem("Pagamento recusado");
        }

        return response;
    }
	
	@PostMapping
    public ResponseEntity<?> pagar(@RequestBody PagamentoRequest request) {
        return ResponseEntity.status(HttpStatus.OK).body(processar(request));
    }
}

