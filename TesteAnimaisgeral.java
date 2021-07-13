package familia28;

public class TesteAnimaisgeral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro dog = new Cachorro("Duque",6,7);
		Cavalo horse = new Cavalo(" Abayomi ", 12, 90);
		Preguica sid = new Preguica(" Sid ", 10, 50);
		
		dog.filhote();
		System.out.println("\n");
		dog.acimaDoPeso();
		System.out.println("\n");
		dog.imprimirInfo();
		System.out.println("\n");
		dog.emitirSom();
		dog.capacidade();
		System.out.println("\n\t ***** outro animal**** ");
		
		
		
		horse.filhote();
		System.out.println("\n");
		horse.acimaDoPeso();
		System.out.println("\n");
		horse.imprimirInfo();
		System.out.println("\n");
		horse.emitirSom();
		horse.capacidade();
		System.out.println("\n\t ***** outro animal**** ");
		
		
		
		sid.filhote();
		System.out.println("\n");
		sid.acimaDoPeso();
		System.out.println("\n");
		sid.imprimirInfo();
		System.out.println("\n");
		sid.emitirSom();
		sid.capacidade();
		System.out.println("\n\t ***** outro animal**** ");
		
		
	
	}

}
