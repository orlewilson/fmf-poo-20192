/*
 * Programação Orientada a Objetos
 * Professor:	Orlewilson Bentes Maia
 * Data:		21/10/2019
 * Atualização:	23/10/2019
 * Autor:		seu nome
 * Descrição:	Classe para representar um cachorro
 */

public class Cachorro extends Animal {

	// atributos
	private String raca;
	private int comprimento;

	// construtores sem argumento e com argumento
	public Cachorro() {
		// primeira forma
//		setApelido("");
//		setCor("");
		// segunda forma
		//super(); // construtor sem argumentos da classe Animal
		
		// terceira forma
		super("",""); // construtor com argumentos da classe Animal
		this.raca = "";
		this.comprimento = 0;
	}

	public Cachorro(String apelido, String cor, String raca, 
			int comprimento) {
		// primeira forma
//		setApelido(apelido);
//		setCor(cor);
		
		// segunda forma
		super(apelido, cor);
		this.raca = raca;
		this.comprimento = comprimento;
	}
	
	// métodos
	public String getRaca() {
		return this.raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getComprimento() {
		return this.comprimento;
	}

	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}	
	
	// exemplo de sobrescrita de método
	public void falar() {
		System.out.println("latir");
	}
}
