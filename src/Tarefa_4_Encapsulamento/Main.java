package Tarefa_4_Encapsulamento;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Carro Supra = new Carro("Renew", "Fox", "32fjdsa", 100);
		
		Supra.Abastecer(99	,5);		
		Supra.ligar();
		Supra.acelerar(180);
		Supra.frear(22);
		System.out.println(Supra.getVelAtual());
	}

	

}
