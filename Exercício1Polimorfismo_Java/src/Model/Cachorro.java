package Model;

public class Cachorro extends Animal{

	public Cachorro(String nome) {
		super("Juliano");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void idade(int idade) {
		System.out.println("Essa é a idade " + idade);
		
	}

	@Override
	public void som() {
		// TODO Auto-generated method stub
		int n = 0;
		for(n = 0; n < 10; n++) {
			System.out.println("Who let the dogs out? Au au au");
		}
	}
	
	public void correr() {
		System.out.println("Cachorro correndo!!");
	}

}
