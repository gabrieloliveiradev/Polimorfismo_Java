package model;

import java.util.Scanner;

public class CarroPasseio extends Veiculo{
	Scanner in = new Scanner(System.in);
	
	private String cor;
	
	private String modelo;
	
	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void EntrPass(){
		System.out.print("Digite a cor do ve�culo: ");
		this.cor = this.in.nextLine();
		System.out.print("Digite o modelo do ve�culo: ");
		this.modelo = this.in.nextLine();
	}
	
	public void MostrPass(){
		System.out.println("A cor do ve�culo �: "+this.cor);
		System.out.println("O modelo do ve�culo�: "+this.modelo);
	}
}
