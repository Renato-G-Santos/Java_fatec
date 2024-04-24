package Java_fatec.src.Heranca.main;

import br.edu.fatec.model.Carro;
import br.edu.fatec.model.Veiculo;
import br.edu.fatec.model.caminhao;
import br.edu.fatec.model.moto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Veiculo carro = new Veiculo("abc-324", "Renault", "logan");
		System.out.println(carro);
		
		Carro civic = new Carro("cba-3a21", "honda", "civic", 4, true);
		
		civic.ligar();
		System.out.println(civic);
		
		moto logan = new moto("abd-2398", "yamarra", "aguia", 1, true);
		
		logan.enpinar();
		
		System.out.println(logan);
		
		caminhao scanea = new caminhao ("ewf-32874", "scanea", "scanea",6, 1000 );
		
		scanea.bater_asa();
		
		System.out.println(scanea);
		
		
		
	}

}