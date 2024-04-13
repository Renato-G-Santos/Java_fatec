package Tarefa_Pratica_1;
import java.util.Scanner; 

public class Exercicio9 {

	
	public static void main(String[] args) { 

		 

		 

		String v[] = new String[6]; 

  

        Scanner ler = new Scanner(System.in);  

         

        for(int i = 0; i < 5; i ++){ 

             

            System.out.println("Digite o " + (i + 1) + " nome: \n"); 

            v[i] = ler.nextLine(); 

        } 

		 

		 

	    System.out.println("Agora digite o Digite o " + 6 + " nome: \n"); 

        v[5] = ler.nextLine();  

         

        System.out.println("Verificando se o sexto nome esta no array \n"); 

  

       for(int i = 0; i < 6; i ++){ 

             

            System.out.println(v[i]); 
       }
	}
}
