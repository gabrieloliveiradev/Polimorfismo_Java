package Model;

public class Preguica extends Animal {

	public Preguica(String nome) {
		super("Josiane");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void idade(int idade) {
		System.out.println("Essa é a idade " + idade);
	}

	@Override
	public void som() {
		// TODO Auto-generated method stub
		System.out.println("-----------");
		System.out.println("... ... ...");
		System.out.println("-----------");
		
	}
	public void subitArvore() {
		System.out.println("Subindo na arvore");
	}

}
