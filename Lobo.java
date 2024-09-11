package classeAbstrata;

public class Lobo extends Animal{

	public Lobo(String nome, String sexo, String raca){
		super(nome, sexo, raca);
	}
	@Override
	public void dormir() {
		System.out.println("O lobo esta dormindo");
	}
	
	@Override
	public void caminhar() {
		System.out.println("O lobo esta caminhando");
	}
	
	@Override
	public void correr() {
		System.out.println("O lobo esta correndo");
	}

	@Override
	public void emitirSom() {
		System.out.println("O lobo esta uivando");
	}
}
