package Tarefa_2_Repetição_e_Matriz;
import java.util.Scanner;

public class Soma_de_Matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]matrizA = new int[3][3]; 
		int [][]matrizB = new int[3][3];
		int [][]soma = new int[3][3];
		Scanner ler = new Scanner(System.in);
		
		for(int i = 0; i < matrizA.length; i++) {
			
			for(int j = 0; j < matrizA.length; j++) {
				
				System.out.println("Digite MatrizA["+ i +"]" + "[" + j + "]");
				matrizA[i][j] = ler.nextInt();				
			}
		}
		

		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
				System.out.println("Digite MatrizB["+ i +"]" + "[" + j + "]");
				
				matrizB[i][j] = ler.nextInt();
				
			}	
		}
		
		System.out.println("MatrizA");
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
				
				System.out.print(matrizA[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("MatrizB");
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
				
				System.out.print(matrizB[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Soma da matrizes");
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
				
				soma[i][j] = matrizB[i][j] + matrizA[i][j];
				System.out.print(soma[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}