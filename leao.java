package classeAbstrata;

public class leao extends Animal {

	public leao(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	@Override
	public void dormir() {
		System.out.println("O leao esta dormindo");

	}

	@Override
	public void caminhar() {
		System.out.println("O leao esta dormindo");

	}

	@Override
	public void correr() {
		System.out.println("O leao esta dormindo");

	}

	@Override
	public void emitirSom() {
		System.out.println("O leao esta rugindo");

	}

}
