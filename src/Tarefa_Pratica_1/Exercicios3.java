package Tarefa_Pratica_1;
import java.util.Scanner; 
public class Exercicios3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int esco, num, numb;
		 

	        double Pi = 3.14, resul; 

	        Scanner ler = new Scanner(System.in); 

	        System.out.println("Digite 1 para calcular area quadrado: "); 

	        System.out.println("Digite 2 para calcular area circulo: "); 

	        esco = ler.nextInt(); 

	         

	        if(esco == 1 ) 

	            { 

	                System.out.println("digite a largura: "); 

	                num = ler.nextInt(); 

	                System.out.println("digite a altura:  "); 

	                numb = ler.nextInt(); 

	                resul = num * numb;  

	                 

	                System.out.println("a area do quadrado e: " + resul); 

	            } 

	            if(esco == 2) 

	            { 

	                System.out.println("digite a raio: "); 

	                num = ler.nextInt(); 

	                resul = Pi * (num * num);  

	                System.out.println("a area do circulo e: " + resul); 

	            } 

	        else 

	            { 

	                System.out.println("opcao invalida"); 

	            } 

	}

}
