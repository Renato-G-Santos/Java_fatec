package Tarefa_Pratica_1;
import java.util.Scanner; 

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int num;    

	        Scanner ler = new Scanner(System.in);   

	  

	        System.out.println("Digite um numero: \n");   

	        num = ler.nextInt();  

	         

	        int i; 

	         

	        for(i = num -1; i >= 1; i--)  

	        { 

	            num = num * i; 

	             

	        }  

	             

	        

	 System.out.println("Resultado: " + num);   
		
		
	}

}
