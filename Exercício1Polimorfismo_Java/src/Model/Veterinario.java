package Model;

public class Veterinario {
	public void examinar(Cachorro cachorro) {
		System.out.println("cachorro sendo examinado");
		cachorro.som();
	}
	
	public void examinar(Cavalo cavalo) {
		System.out.println("cavalo sendo examinado");
		cavalo.som();
	}
	
	public void examinar(Preguica preguica) {
		System.out.println("preguiça sendo examinada");
		preguica.som();
	}
}
