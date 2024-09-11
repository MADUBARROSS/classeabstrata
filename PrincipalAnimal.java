package classeAbstrata;

public class PrincipalAnimal {

	public static void main(String[] args) {
		
		Lobo montanhes = new Lobo("lobomau", "macho", "montanhes");
		montanhes.dormir();
		montanhes.caminhar();
		montanhes.correr();
		montanhes.emitirSom();
		
		System.out.println("------------------------");
		
		
		leao africano = new leao("simba", "macho", "africano");
		africano.dormir();
		africano.caminhar();
		africano.correr();
		africano.emitirSom();
		
		System.out.println("------------------------");
		
		Tigre branco = new Tigre("diego", "macho", "branco");
		branco.dormir();
		branco.caminhar();
		branco.correr();
		branco.emitirSom();
		
		System.out.println("------------------------");
		
		Cachorro Buldogue = new Cachorro("paçoca", "femea", "buldogue");
		Buldogue.dormir();
		Buldogue.caminhar();
		Buldogue.correr();
		Buldogue.emitirSom();
		
		System.out.println("------------------------");
		
		Gato preto = new Gato("faisca", "femea", "preto");
		preto.dormir();
		preto.caminhar();
		preto.correr();
		preto.emitirSom();

	}

}
