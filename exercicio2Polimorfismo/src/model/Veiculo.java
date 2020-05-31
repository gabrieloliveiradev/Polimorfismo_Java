package model;

import java.util.Scanner;

public class Veiculo {
	Scanner in = new Scanner(System.in);
	
	private int pesoQuilos;
	
	private int velMax;
	
	private float preco;
		
	public int getPesoQuilos() {
		return pesoQuilos;
	}

	public void setPesoQuilos(int pesoQuilos) {
		this.pesoQuilos = pesoQuilos;
	}

	public int getVelMax() {
		return velMax;
	}

	public void setVelMax(int velMax) {
		this.velMax = velMax;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void EntrVeic() {
		System.out.println("\nDigite o peso do veículo: ");
		this.pesoQuilos = this.in.nextInt();
		System.out.println("\nDigite a velocidade máxima do veículo: ");
		this.velMax = this.in.nextInt();
		System.out.println("\nDigite o preço do veículo: ");
		this.preco = this.in.nextFloat(); 
	}
	
	public void MostrVeic() {
		System.out.println("\nO peso do veículo é: "+this.pesoQuilos+" quilos");
		System.out.println("\nA velocidade máxima do veículo é "+this.velMax+" Km/h");
		System.out.printf("\nO preço do veículo é R$ %.2f",this.preco);
	}
}
