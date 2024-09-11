package classeAbstrata;

public class moto extends Veiculos{

	public moto(String placa, String modelo, String cor, int ano) {
		super(placa, modelo, cor, ano);
	}
	@Override
	public void acelerar() {
		System.out.println("O moto esta acelerando");
	}
	
	@Override
	public void frear() {
		System.out.println("O moto esta freando");
	}
	
	@Override
	public void virar() {
		System.out.println("O moto esta virando");
	}
	
	@Override
	public void ligar() {
		System.out.println("O moto esta ligado");
	}
}
