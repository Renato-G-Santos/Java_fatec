package Tarefa_Pratica_1;
import java.util.Scanner; 
public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, t = 0, i = 0, r = 0; 

        

		  

        Scanner ler = new Scanner(System.in);    

        System.out.println("Digite um numero: \n");    

        num = ler.nextInt(); 

         

        while(t < num)  

        {  

            i++; 

             

            if (i%2 != 0){ 

                 

                t++; 

                r += i; 

            } 

	    } 

        System.out.println(r);    
	}

}
