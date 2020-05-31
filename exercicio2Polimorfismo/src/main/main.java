package main;

import model.Caminhao;
import model.CarroPasseio;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarroPasseio carro = new CarroPasseio();
		carro.EntrVeic();
		carro.MostrVeic();
		carro.MostrPass();
		carro.EntrPass();
		
		Caminhao caminhao = new Caminhao();
		caminhao.EntrVeic();
		caminhao.MostrVeic();
		caminhao.MostrCam();
		caminhao.EntrCam();
	}

}
