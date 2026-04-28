package br.edu.utfpr.td.tsi.ecommerce.web.pagamento;

public class PagamentoResponse {
    private boolean aprovado;
    private String mensagem;
    
	public boolean isAprovado() {
		return aprovado;
	}
	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
    
    
}
