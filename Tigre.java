package classeAbstrata;

public class Tigre extends Animal {

	public Tigre(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	@Override
	public void dormir() {
		System.out.println("O tigre esta dormindo");

	}

	@Override
	public void caminhar() {
		System.out.println("O tigre esta dormindo");

	}

	@Override
	public void correr() {
		System.out.println("O tigre esta dormindo");

	}

	@Override
	public void emitirSom() {
		System.out.println("O tigre esta rugindo");

	}
	
}
