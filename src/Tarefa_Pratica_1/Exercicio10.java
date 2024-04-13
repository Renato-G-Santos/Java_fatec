package Tarefa_Pratica_1;
import java.util.Scanner; 

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        boolean conf = false; 

        String attem, senha = "senha";  

         

        Scanner ler = new Scanner(System.in);  

  

       while(conf == false){ 

             

            System.out.println("Digite a senha \n"); 

            attem = ler.nextLine(); 

            if(attem.equals(senha) ){ 

                 

                conf = true; 

            } 

            else{ 

                 

            System.out.println("\n Senha incoreta, tente novamente"); 

            } 

        } 

         

        System.out.println("\n Sucesso"); 

  
		
		
	}

}
