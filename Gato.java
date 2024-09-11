package classeAbstrata;

public class Gato extends Animal{

	public Gato(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	@Override
	public void dormir() {
		System.out.println("O gato esta dormindo");

	}

	@Override
	public void caminhar() {
		System.out.println("O gato esta dormindo");

	}

	@Override
	public void correr() {
		System.out.println("O gato esta dormindo");

	}

	@Override
	public void emitirSom() {
		System.out.println("O gato esta miando");

	}
}
