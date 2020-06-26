package petsitter;

public class Cliente extends Cadastro {
	
	public Cliente(String name, String email, String cpf, Endereco address, String phone, Animal animal) {
		super(name, email, cpf, address, phone, animal);
	}
}
