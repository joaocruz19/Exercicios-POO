package fluxo;

import java.util.Scanner;
import java.util.ArrayList;

public class Inicio {

	public static void main(String[] args) {
		Scanner u = new Scanner(System.in);
		System.out.println("Cadastrar Login\n");
		System.out.println("Login: \n");
		String login = u.nextLine(); 
		
		System.out.println("Senha: \n");
		String senha = u.nextLine();
		
		System.out.println("Cadastrar Usuario\n");
		System.out.println("Nome: \n");
		String nome = u.nextLine();
		
		System.out.println("Telefone: \n");
		String telefone = u.nextLine();
		
		System.out.println("Endereço: \n");
		String endereco = u.nextLine();
		
		System.out.println("E-mail: \n");
		String email = u.nextLine();
		
		Login usuario;
		
		usuario = new Login();
		
		usuario.setSenha(senha);
		usuario.setLogin(login);
		usuario.setNome(nome);
		usuario.setTelefone(telefone);
		usuario.setEndereco(endereco);
		usuario.setEmail(email);
		
		ArrayList<Login> usuarios = new ArrayList<Login>();
		
		usuarios.add(usuario);
		
		
		
		
		

	}

}
