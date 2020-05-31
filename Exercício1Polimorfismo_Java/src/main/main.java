package main;

import Model.Cachorro;
import Model.Cavalo;
import Model.Preguica;
import Model.Veterinario;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Preguica preguica = new Preguica("Josiane");
		Cavalo cavalo = new Cavalo("Geraldo");
		Cachorro cachorro = new Cachorro("Juliano");
		Veterinario veterinario = new Veterinario();
		
		preguica.som();
		cavalo.som();
		cachorro.som();
		veterinario.examinar(cachorro);
		veterinario.examinar(cavalo);
		veterinario.examinar(preguica);
		
		
	}

}
