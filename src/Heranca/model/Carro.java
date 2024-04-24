package Java_fatec.src.Heranca.model;

public class Carro extends Veiculo{
	
	private int qtdPortas;
	private boolean tetoSolar;
	public Carro(String placa, String marca, String modelo, int qtdPorta, Boolean tetoSolar){
	
		super(placa, marca, modelo);
		this.qtdPortas = qtdPorta;
		this.tetoSolar = tetoSolar;
		
	}
	
	public void drift() {
		
		System.out.println("Cantou Pneu!");
		
	}
	public String toString() {
		return "Veiculo: \n"
				+ "marca: " + this.getMarca() +  "\n" 
				+ "modelo: " + this.getModelo() + "\n" 
				+ "placa: " + this.getPlaca()+ "\n"
				+ "Porta; " + this.qtdPortas + "\n"
				+ "Teto Solar: " + (this.tetoSolar==true?  "possui": "Não Possui");
	} 
	
	
}

