package model;

import java.util.Scanner;

public class Caminhao extends Veiculo{
	Scanner in = new Scanner(System.in);
	
	private int cargaMaxima;
	
	private int alturaMaxima;
	
	private int comprimento;

	public int getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	public int getAlturaMaxima() {
		return alturaMaxima;
	}

	public void setAlturaMaxima(int alturaMaxima) {
		this.alturaMaxima = alturaMaxima;
	}

	public int getComprimento() {
		return comprimento;
	}

	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	
	public void EntrCam() {
		System.out.print("Digite a carga máxima do caminhão: ");
		this.cargaMaxima = this.in.nextInt();
		System.out.print("Digite a altura máxima do caminhão: ");
		this.alturaMaxima = this.in.nextInt();
		System.out.print("Digite o comprimento do caminhão: ");
		this.comprimento = this.in.nextInt();
	}
	
	public void MostrCam() {
		System.out.println("A carga máxima do caminhão é de: "+this.cargaMaxima+" toneladas");
		System.out.println("A altura máxima do caminhão é de: "+this.alturaMaxima+" metros");
		System.out.println("O comprimento do caminhão é de: "+this.comprimento+" metros");
	}
}
