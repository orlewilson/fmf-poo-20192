/*
 * Programação Orientada a Objetos
 * Professor:	Orlewilson Bentes Maia
 * Data:		21/10/2019
 * Atualização:	23/10/2019
 * Autor:		seu nome
 * Descrição:	Classe para representar um coelho
 */
public class Coelho extends Animal{

	// atributos
	private int tamanhoDente;
	private int tamanhoOrelha;

	// construtores sem argumento e com argumento
	public Coelho() {
		super();
		this.tamanhoDente = 0;
		this.tamanhoOrelha = 0;
	}

	public Coelho(String apelido, String cor, int tamanhoDente, 
			int tamanhoOrelha) {
		super(apelido, cor);
		this.tamanhoDente = tamanhoDente;
		this.tamanhoOrelha = tamanhoOrelha;
	}

	// métodos
	public int getTamanhoDente() {
		return this.tamanhoDente;
	}

	public void setTamanhoDente(int tamanhoDente) {
		this.tamanhoDente = tamanhoDente;
	}

	public int getTamanhoOrelha() {
		return this.tamanhoOrelha;
	}

	public void setTamanhoOrelha(int tamanhoOrelha) {
		this.tamanhoOrelha = tamanhoOrelha;
	}
	
	// exemplo de sobrescrita de método
	public void falar() {
		System.out.println("O que que há velhinho?");
	}
}
