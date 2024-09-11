package classeAbstrata;

public class carro2 extends Veiculos{
	public carro2(String placa, String modelo, String cor, int ano) {
		super(placa, modelo, cor, ano);
	}
	@Override
	public void acelerar() {
		System.out.println("O carro2 esta acelerando");
	}
	
	@Override
	public void frear() {
		System.out.println("O carro2 esta freando");
	}
	
	@Override
	public void virar() {
		System.out.println("O carro2 esta virando");
	}
	
	@Override
	public void ligar() {
		System.out.println("O carro2 esta ligado");
	}

}
