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
		System.out.print("Digite a carga m�xima do caminh�o: ");
		this.cargaMaxima = this.in.nextInt();
		System.out.print("Digite a altura m�xima do caminh�o: ");
		this.alturaMaxima = this.in.nextInt();
		System.out.print("Digite o comprimento do caminh�o: ");
		this.comprimento = this.in.nextInt();
	}
	
	public void MostrCam() {
		System.out.println("A carga m�xima do caminh�o � de: "+this.cargaMaxima+" toneladas");
		System.out.println("A altura m�xima do caminh�o � de: "+this.alturaMaxima+" metros");
		System.out.println("O comprimento do caminh�o � de: "+this.comprimento+" metros");
	}
}
