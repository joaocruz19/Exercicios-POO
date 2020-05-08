package concecionaria;

public class Cliente {
	private String nome;
	private String telefone;
	private Endereco end;
	private String cpf;
	private Veiculos vei;
	
	public Cliente(String nome, String telefone, String cpf, Endereco end, Veiculos vei) {
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEnd() {
		return end;
	}

	public void setEnd(Endereco end) {
		this.end = end;
	}

	public Veiculos getVei() {
		return vei;
	}

	public void setVei(Veiculos vei) {
		this.vei = vei;
	}
	
	
	

}
