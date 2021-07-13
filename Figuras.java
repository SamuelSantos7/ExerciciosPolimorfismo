package familia28;

public interface Figuras {

	public String nomeInterface = "Figuras";
	//Criamos dois metodos abstratos (getnome e set nome )
	abstract public String getNome();
	abstract public void setNome(String nome);
	
	public double getArea();
	public double getPerimetro();
	double getDiagonal();
	
}
