package concecionaria;

public class Endereco {
	private String rua;
	private String numero;
	private String bairro;
	private String cep;
	private String cidade;
	
	
	
	public Endereco(String rua, String numero, String bairro, String cep, String cidade) {
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "Endereco: [rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", cep=" + cep + ", cidade="
				+ cidade + "]";
	}
	
	
	

}
