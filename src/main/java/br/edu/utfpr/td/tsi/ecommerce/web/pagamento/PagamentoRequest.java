package br.edu.utfpr.td.tsi.ecommerce.web.pagamento;

public class PagamentoRequest {
	private double valor;
    private String numeroCartao;
    private String nomeTitular;
    
    
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
    
    
}
