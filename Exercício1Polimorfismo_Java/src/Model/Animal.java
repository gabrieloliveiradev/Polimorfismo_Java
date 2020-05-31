package Model;

public abstract class Animal {
	protected String nome = "sem nome";
	
	public Animal (String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	abstract public void idade (int idade);
	abstract public void som ();
}
