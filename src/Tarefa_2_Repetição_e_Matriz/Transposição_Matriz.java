package Tarefa_2_Repetição_e_Matriz;

import java.util.Scanner;

public class Transposição_Matriz {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int [][]matriz = new int[3][3]; 
		int [][]tranposta = new int[3][3];
		Scanner ler = new Scanner(System.in);
		
		for(int i = 0; i < matriz.length; i++) {
			
			for(int j = 0; j < matriz.length; j++) {
				
				System.out.println("Digite MatrizA["+ i +"]" + "[" + j + "]");
				matriz[i][j] = ler.nextInt();				
			}
		}
		

		
		System.out.println("MatrizA");
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
				
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		
		System.out.println("Matriz transposta");
		for(int i = 0; i < matriz[0].length; i++) {
			
			for(int j = 0; j < matriz.length; j++) {
				
				tranposta[j][i] = matriz[i][j];
				System.out.print(tranposta[j][i] + " ");
			}
			System.out.println();
		}
		
	
	}	
}
