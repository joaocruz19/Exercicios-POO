package petsitter;

import java.util.ArrayList;
import java.util.Scanner;

public class Opcoes {
	private ArrayList<Profissional> profissionais;
	private ArrayList<Cliente> clientes;
	private Animal[] animals;
	private Scanner scanner;
	
	public Opcoes() {
		profissionais = new ArrayList<Profissional>();
		clientes = new ArrayList<Cliente>();
		animals = new Animal[5];
		scanner = new Scanner(System.in);
		
	}
	
	public void Register() {
		System.out.println("Deseja cadastrar Profissional ou Cliente");
		System.out.println("[1] - Profissional\n");
		System.out.println("[2] - Cliente\n");
		int options = scanner.nextInt();
		if (options == 1) {
			System.out.println("\nNome: \n");
			String name = scanner.next();
			
			System.out.println("\nEmail: ");
			String email = scanner.next();
			
			System.out.println("\nCPF:\n");
			String cpf = scanner.next();
			
			System.out.println("\nEndere�o: \n");
			System.out.println("Rua: \n");
			String rua = scanner.next();
			
			System.out.println("Numero: \n");
			int numero = scanner.nextInt();
			
			System.out.println("CEP: \n");
			String cep = scanner.next();
			
			System.out.println("Bairro: \n");
			String bairro = scanner.next();
			
			System.out.println("Cidade: \n");
			String cidade = scanner.next();
			
			System.out.println("Estado: \n");
			String estado = scanner.next();
			
			System.out.println("\nTelefone: ");
			String telefone = scanner.next();
			
			
			Endereco end = new Endereco(rua, numero, cep, bairro, cidade, estado);
			
			Profissional news = new Profissional(name, email, cpf, end, telefone);
			profissionais.add(news);
			System.out.println("Contato adicionado");
		}
		
		if (options == 2) {
			System.out.println("Cadastrar Cliente");
			System.out.println("\nNome: \n");
			String name = scanner.next();
			
			System.out.println("\nEmail: ");
			String email = scanner.next();
			
			System.out.println("\nCPF:\n");
			String cpf = scanner.next();
			
			System.out.println("\nEndere�o: \n");
			System.out.println("Rua: \n");
			String rua = scanner.next();
			
			System.out.println("Numero: \n");
			int numero = scanner.nextInt();
			
			System.out.println("CEP: \n");
			String cep = scanner.next();
			
			System.out.println("Bairro: \n");
			String bairro = scanner.next();
			
			System.out.println("Cidade: \n");
			String cidade = scanner.next();
			
			System.out.println("Estado: \n");
			String estado = scanner.next();
			
			System.out.println("\nTelefone: \n");
			String telefone = scanner.next();
			
			for (int x = 0; x > animals.length; x++) {
				if (animals[x] == null) {
					System.out.println("Cadastro do animal");
					System.out.println("\nRa�a: \n");
					String breed = scanner.next();
					
					System.out.println("G�nero: \n");
					String gender = scanner.next();
					
					System.out.println("Idade: \n");
					int age = scanner.nextInt();
					
					Animal ani = new Animal(breed, gender, age);
					animals[x] = ani;
					
					System.out.println("Animal Cadastrado");
				}
			}
			
			Endereco end = new Endereco(rua, numero, cep, bairro, cidade, estado);
			
			Cliente news = new Cliente(name, email, cpf, end, telefone, ani);
			clientes.add(news);
			System.out.println("Cliente adicionado");
			
			
		} else {
			System.out.println("Op��o Inv�lida");
		}
		
		
	}
	
	
	public void Editar() {
		
	}
	
	public void Excluir() {
		System.out.println("Voc� deseja excluir profissional ou cliente: \n");
		System.out.println("[1] - Profissional\n");
		System.out.println("[2] - Cliente\n");
		int escolha = scanner.nextInt();
		if (escolha == 1) {
			System.out.println("Digite o nome e cpf do Profissional.\n");
			System.out.println("Nome: \n");
			String name = scanner.next();
			System.out.println("CPF: \n");
			String cpf = scanner.next();
			
			Profissional exit = new Profissional(name, cpf, null, null, null);
			profissionais.remove(exit);
			System.out.println("\nProfissional Removido.");
		} 
		
		if (escolha == 2) {
			System.out.println("Digite o nome e cpf do Cliente.\n");
			System.out.println("Nome: \n");
			String name = scanner.next();
			System.out.println("CPF: \n");
			String cpf = scanner.next();
			
			Cliente exit = new Cliente(name, cpf, null, null, null, ani);
			clientes.remove(exit);
			System.out.println("\nCliente Removido.");
		} else {
			System.out.println("Op��o Inv�lida");
		}
		
	}
	
	//Incompleto
	public void Consultar() {
		for (Profissional profissional: profissionais) {
			if (profissional != null) {
				System.out.println("Nome: \n" + profissional.getName()+ 
						"Email: \n"+profissional.getEmail()+ 
						"CPF: \n" +profissional.getCpf()+
						"Endere�o: \n" +profissional.getEnd()+
						"Telefone: \n" +profissional.getTelefone());
			}
		}
	}
	

}