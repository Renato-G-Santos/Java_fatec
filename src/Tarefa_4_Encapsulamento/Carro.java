package Tarefa_4_Encapsulamento;

public class Carro {
	
	public String marca; 
	public String modelo;
	public String placa;
	public double velMax = 180;
	public double velMin = 0;
	public double velAtual = 0;
	public boolean estado = false; 
	public int cap_Tank;
	
	
	
	public Carro(String marca, String modelo, String placa, int cap_Tank){
	
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cap_Tank = cap_Tank;
		
	}
	
	
	public void setCap_tank(int tanque) {
		
		this.cap_Tank = tanque;
		
	}
	
	public int getCap_tank() {
		
		return this.cap_Tank;
	}
	
	public void Abastecer(int litros, int preço) {
		
		if(litros < this.cap_Tank) {
			
			System.out.printf("Preço total: %d \n", (litros * preço));			
		}
		else {
			System.out.println("Não cabe");
			
		}
		
		
	}
	
	public void velOff() {
		
		if(estado == false) {
			this.velAtual = 0;		
		}
	}
	
	public void ligar(){
		if(this.estado == false) {
			System.out.println("Ligando...");
			System.out.println("Ligando!");	
			estado = true;
		}	
		else {
			
			System.out.println("O carro já está lidado");
		}
	}
	public void desligar() {
		if(this.estado == true) {
			System.out.println("desligando...");
			System.out.println("desligado!");
			estado = false;
		}	
		else {
			
			System.out.println("O carro já está desligado");
			this.velOff();
			
		}
	}	
	public double getVelAtual() {
		return velAtual;
	}


	public void setVelAtual(double velAtual) {
		this.velAtual = velAtual;
	}


	public void acelerar(double aceleracao) {
		
		if(estado == true) { 
			
			if(this.velAtual < this.velMax) {
				this.velAtual += aceleracao; // this.deste objeto			
			}
				if (velAtual >= 180) {
					this.velAtual = 180;
					System.out.println("Velocidade Máxima atingida");
				}
			else {
				System.out.println("Velocidade Máxima Atingida");
			}
		} 
		else {
			System.out.println("O carro está delisgado");
			this.velOff();
		}
	}	
	public void frear(double frear){
		this.velAtual -= frear; // this.deste objeto
		if(frear <= 0 ){
			System.out.println("o carro já esta parado");
		}
		if (velAtual < 0) {
			this.velAtual = 0;
		}
	}	
	public void buzinar(){
		System.out.println("Bi bi bi");
		}	
	
	
	
}
