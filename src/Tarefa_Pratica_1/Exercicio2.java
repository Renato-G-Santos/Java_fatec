package Tarefa_Pratica_1;
import java.util.Scanner;  

public class Exercicio2 {

	public static void main(String[] args) {
		
        int num, numb;  

        Scanner ler = new Scanner(System.in); 

        System.out.println("Digite primeiro numero: "); 

        num = ler.nextInt(); 

        System.out.println("Digite segundo numero: "); 

        numb = ler.nextInt(); 

         

        if(num == numb) 

            { 

                System.out.println("numeros iguais "); 

            } 

        else 

            { 

                System.out.println("numero diferentes"); 

                if(num > numb) 

                { 

                    System.out.println("primeiro numero maior"); 

                } 

                else  

                { 

                    System.out.println("segundo numero maior"); 

                } 

 

            } 
		
	}

}
