package petsitter;

public class Cliente extends Cadastro{
	
	public Cliente(String name, String email, String cpf, Endereco end, String telefone, Animal ani) {
		super(name, email, cpf, end, telefone, ani);
	}

}
