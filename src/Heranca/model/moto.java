package Java_fatec.src.Heranca.model;

public class moto extends Veiculo{

	
	private int qtdbanco;
	private boolean bagageiro;
	public moto(String placa, String marca, String modelo, int qtdbanco, Boolean bagageiro){
	
		super(placa, marca, modelo);
		this.qtdbanco = qtdbanco;
		this.bagageiro = bagageiro;
		
	}
	
	public void enpinar() {
		
		System.out.println("caiu!");
		
	}
	public String toString() {
		return "Veiculo: \n"
				+ "marca: " + this.getMarca() +  "\n" 
				+ "modelo: " + this.getModelo() + "\n" 
				+ "placa: " + this.getPlaca()+ "\n"
				+ "Bancos; " + this.qtdbanco + "\n"
				+ "bagageiro: " + (this.bagageiro==true? "possui" : "não possui" );
	} 
	
	
	
}
