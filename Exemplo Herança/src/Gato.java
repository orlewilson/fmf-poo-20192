/*
 * Programação Orientada a Objetos
 * Professor:	Orlewilson Bentes Maia
 * Data:		18/10/2019
 * Atualização:	18/10/2019
 * Autor:		seu nome
 * Descrição:	Classe para representar um gato
 */

public class Gato {

	// atributos
	private String apelido;
	private String pelo;
	private String cor;
	private String raca;
	private String sexo;
	private int idade;
	private int qtdVidas;
	private int comprimento;

	// construtores
	public Gato() {

	}

	public Gato(String apelido, String pelo, String cor, String raca, String sexo, int idade, int qtdVidas,
			int comprimento) {

	}

	// métodos
	public void falar() {
		System.out.println("miando...");
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
