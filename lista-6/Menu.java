package petsitter;

import java.util.Scanner;

public class Menu {
	public static void renderOptions() {
		System.out.println("Cadastro: ");
		System.out.println("\n1 - Cadastar");
		System.out.println("\n2 - Editar Cadastro");
		System.out.println("\n3 - Excluir");
		System.out.println("\n4 - Consultar");
		System.out.println("\n5 - Sair");
		System.out.println("\n - Opção: ");
	}

	public static void main(String[] args) {
		int option;
		Scanner input = new Scanner(System.in);
		
		do {
			renderOptions();
			option = input.nextInt();
			
			switch(option) {
				case 1:
					//Register;
					break;
				case 2:
					//Editar;
					break;
				case 3:
					//Excluir();
					break;
				case 4:
					//Consultar();
					break;
				case 5:
					//
					break;
				default:
					System.out.println("Opção inválida");
			}
			
		} while(option != 5);
	}
}
