import javax.crypto.AEADBadTagException;

/*
 * Programação Orientada a Objetos
 * Professor:	Orlewilson Bentes Maia
 * Data:		18/10/2019
 * Atualização:	18/10/2019
 * Autor:		seu nome
 * Descrição:	Classe para representar um coelho
 */

public class Papagaio {

	// atributos
	private String apelido;
	private String cor;
	private String especie;
	private int idade;
	private int tamanhoAsa;
	private boolean fala;
	private boolean voa;

	// construtores
	public Papagaio() {

	}

	public Papagaio(String apelido, String cor, String especie, int idade, int tamanhoAsa, boolean fala, boolean voa) {

	}

	// métodos
	public void falar() {
		System.out.println("gritando...");
	}

	public void correr() {
		System.out.println("correndo...");
	}

	public void morder() {
		System.out.println("mordendo...");
	}

	// imprimir os valores de cada atributo
	public void mostrarInformacoes() {

	}
}
