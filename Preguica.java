package familia28;

public class Preguica extends Animal {
	
	public Preguica(String nome, int idade, double peso ) {
		super( nome, idade, peso);
		
		
	}

	
	
	
	
	public void imprimirInfo() {
		System.out.println("\nSeu animal: " + getNome() + " com " + getIdade() + " anos " + " \npesando: " + getPeso()); 
		
	}

	@Override
	public void emitirSom() 
	{
		System.out.println(" nhac nhac  ");
	}
	@Override
	public void capacidade() 
	{
		System.out.println(" Deve subir em Árvores : ");
	}
}
