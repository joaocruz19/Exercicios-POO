package petsitter;

public class Endereco {
	public String rua;
	public int numero;
	public String cep;
	public String bairro;
	public String cidade;
	public String estado;
	
	public Endereco(String rua, int numero, String cep, String bairro, String cidade, String estado) {
		this.rua = rua;
		this.numero = numero;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

}