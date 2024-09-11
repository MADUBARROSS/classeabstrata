package classeAbstrata;

public class principal {
	
	public static void main(String[] args) {
		
		carro ferrari = new carro("00000", "F1", "Vermelho",2023);
		ferrari.ligar();
		ferrari.acelerar();
		ferrari.virar();
		ferrari.frear();
		
		System.out.println("------------------------");
		
		onibus marcopolo = new onibus("11111", "XB1","Prata", 2020);
		marcopolo.ligar();
		marcopolo.acelerar();
		marcopolo.virar();
		marcopolo.frear();
		
		System.out.println("------------------------");
		
		moto biz = new moto("22222", "pop100","branca", 2015);
		biz.ligar();
		biz.acelerar();
		biz.virar();
		biz.frear();
		
		System.out.println("------------------------");
		
		carro2 hb20 = new carro2("33333", "Hyundai", "pret0",2022);
		hb20.ligar();
		hb20.acelerar();
		hb20.virar();
		hb20.frear();
	}

}
