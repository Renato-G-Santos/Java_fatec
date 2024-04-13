package Tarefa_2_Repetição_e_Matriz;
import java.util.Scanner;


public class Multiplicação_Matriz_Escalar {

	public static void main(String[] args) {
		
		
		String [][]bdd = new String[6][2];
		Scanner read = new Scanner(System.in);
		String nome, senha;
		
		for(int i = 0; i < 6; i++) {
			
			
			System.out.println("Digite nome de Login");
			bdd [i][0] = read.nextLine();
						
			System.out.printf("%s Digite uma senha \n", bdd[i][0] );
			bdd [i][1] = read.nextLine();

		}
		
		System.out.println("faça login em uma Conta");
		boolean veri = true;
		while(veri)
		{
			int i = 0;	
			System.out.println("Login: ");
			nome = read.nextLine();
			for( i = 0; i < 6; i++) {
				
				
				if (nome.equals(bdd[i][0]) ) {
	
					System.out.println("Senha: " );
					senha= read.nextLine();
					
					if (senha.equals(bdd[i][1])) {
						System.out.println(" " );
						
						System.out.println("Login efetuado com sucesso");
						veri = false;
						}
				}
		}

			
			System.out.println("Login errado");
			
		}
		
		int d = 0;
		for(int i = 0; i < 6; i++) {
		
			for(int j = 0; j < 2; j++) {
				
				if(d == 2 ) {
					System.out.println("");
					d = 0;
				}
				
				System.out.print(bdd[i][j] + "   ");
				d++;
			}
			
		}
		
		
	}

}
