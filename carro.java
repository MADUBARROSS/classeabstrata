package classeAbstrata;

public class carro extends Veiculos{

	public carro(String placa, String modelo, String cor, int ano) {
		super(placa, modelo, cor, ano);
	}
	@Override
	public void acelerar() {
		System.out.println("O carro esta acelerando");
	}
	
	@Override
	public void frear() {
		System.out.println("O carro esta freando");
	}
	
	@Override
	public void virar() {
		System.out.println("O carro esta virando");
	}
	
	@Override
	public void ligar() {
		System.out.println("O carro esta ligado");
	}
}
