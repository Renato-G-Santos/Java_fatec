package br.edu.fatec.model;

public class caminhao extends Veiculo{
	
	private int qtdEixo;
	private int qtdLitros;
	
	public caminhao(String placa, String marca, String modelo, int qtdEixo, int qtdLitros){
	
		super(placa, marca, modelo);
		this.qtdEixo = qtdEixo;
		this.qtdLitros = qtdLitros;
		
	}
	
	public void bater_asa() {
		
		System.out.println("tombou!");
		
	}
	public String toString() {
		return "Veiculo: \n"
				+ "marca: " + this.getMarca() +  "\n" 
				+ "modelo: " + this.getModelo() + "\n" 
				+ "placa: " + this.getPlaca()+ "\n"
				+ "Quantidade de Eixos; " + this.qtdEixo + "\n"
				+ "bagageiro: " + this.qtdLitros;
	} 
	
	
	
}
