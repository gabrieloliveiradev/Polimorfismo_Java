package Model;

public class Cavalo extends Animal {

	public Cavalo(String nome) {
		super("Geraldo");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void idade(int idade) {
		// TODO Auto-generated method stub
		System.out.println("Essa � a idade " + idade);
	}

	@Override
	public void som() {
		// TODO Auto-generated method stub
		System.out.println("Minha eguinha pocot�!!");
	}
	
	public void correr () {
		System.out.println("Cavalo correndo!!!");
	}

}
