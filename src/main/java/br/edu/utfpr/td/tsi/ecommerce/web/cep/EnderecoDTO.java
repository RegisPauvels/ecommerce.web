package br.edu.utfpr.td.tsi.ecommerce.web.cep;

public class EnderecoDTO {

    private String rua;
    private String cidade;
    private String estado;

    public EnderecoDTO(ViaCepResponse viaCep) {
        this.rua = viaCep.getLogradouro();
        this.cidade = viaCep.getLocalidade();
        this.estado = viaCep.getUf();
    }

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

    
}
