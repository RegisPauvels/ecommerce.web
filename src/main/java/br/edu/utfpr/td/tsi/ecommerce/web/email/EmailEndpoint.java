package br.edu.utfpr.td.tsi.ecommerce.web.email;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/email")
public class EmailEndpoint {

	
    public boolean enviarEmail(EmailRequest email) {

        System.out.println("Simulando envio de email...");
        System.out.println("Para: " + email.getPara());
        System.out.println("Assunto: " + email.getAssunto());
        System.out.println("Mensagem: " + email.getMensagem());

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        return true;
    }

    @PostMapping
    public boolean enviar(@RequestBody EmailRequest request) {
        return enviarEmail(request);
    }
}
