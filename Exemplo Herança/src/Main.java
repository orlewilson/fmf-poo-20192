/*
 * Programação Orientada a Objetos
 * Professor:	Orlewilson Bentes Maia
 * Data:		18/10/2019
 * Atualização:	11/10/2019
 * Autor:		seu nome
 * Descrição:	Exemplificar objetos da classe Cachorro
 */

public class Main {

	public static void main(String[] args) {

		// objetos da classe Cachorro
		// usando construtor sem argumentos
		Cachorro toto = new Cachorro();

		// usando construtor com argumentos
		Cachorro golias = new Cachorro("Golias", "chowchow", "caramelo", 1.5f, 55f);

		// acessando atributos (com encapsulamento)
		toto.setApelido("Totó");
		toto.setComprimento(1.32f);
		toto.setCor("marrom");
		toto.setPeso(0.8f);
		toto.setRaca("viralata");

		// imprimir o conteúdo de cada atributo
		toto.mostrarInformacoes();

		// chamar os métodos
		toto.correr();
		toto.falar();
		toto.morder();

		golias.mostrarInformacoes();
	}
}
