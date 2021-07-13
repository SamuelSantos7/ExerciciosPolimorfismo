package familia28;

public class Cavalo extends Animal {
	
	
	
	public Cavalo (String nome, int idade, double peso ) {
		super(nome, idade, peso);
		
		
	}

	
	
	public void imprimirInfo() {
		System.out.println("\nSeu animal: " + getNome() + " com " + getIdade() + " anos " + " \npesando: " + getPeso() 
	);
		
	}

	@Override
	public void emitirSom() {
		System.out.println(" Irrrrrrrr ");
	}
	@Override
	public void capacidade() 
	{
		System.out.println(" Deve correr mais que o cachorro ");
	}
}
