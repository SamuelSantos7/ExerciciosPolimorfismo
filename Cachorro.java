package familia28;

public class Cachorro extends Animal {

	
	
	
	public Cachorro (String nome, int idade, double peso ) {
		super(nome, idade, peso);
		
	}


	
	
	public void imprimirInfo() {
		System.out.println("\nSeu animal: " + getNome() + " com " + getIdade() + " anos " + " \npesando: " + getPeso());  
	}


	@Override
	public void emitirSom() {
		System.out.println(" Auauau  ");
	}
	
	@Override
	public void capacidade() {
		System.out.println(" correr ");
	}
	
}
