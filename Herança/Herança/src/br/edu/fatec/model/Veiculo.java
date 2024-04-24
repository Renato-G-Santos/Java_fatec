package br.edu.fatec.model;

public class Veiculo {

	private String marca; 
	private String modelo;
	private String placa;
	private boolean estado = false;
	
	public Veiculo(String placa, String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public void ligar() {
		
		System.out.println("Ligando... ligando");
	}
	
	@Override
	public String toString() {
		return "Veiculo: \n"
				+ "marca: " + marca +  "\n" +
				"modelo: " + modelo + "\n" +
				"placa: " + placa + "]";
	} 
	
	
	
}
