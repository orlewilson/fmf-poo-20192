/*
 * Programa��o Orientada a Objetos
 * Professor:	Orlewilson Bentes Maia
 * Data:		18/10/2019
 * Atualiza��o:	11/10/2019
 * Autor:		seu nome
 * Descri��o:	Exemplificar objetos da classe Cachorro
 */

public class Main {

	public static void main(String[] args) {

		// objetos da classe Cachorro
		// usando construtor sem argumentos
		Cachorro toto = new Cachorro();

		// usando construtor com argumentos
		Cachorro golias = new Cachorro("Golias", "chowchow", "caramelo", 1.5f, 55f);

		// acessando atributos (com encapsulamento)
		toto.setApelido("Tot�");
		toto.setComprimento(1.32f);
		toto.setCor("marrom");
		toto.setPeso(0.8f);
		toto.setRaca("viralata");

		// imprimir o conte�do de cada atributo
		toto.mostrarInformacoes();

		// chamar os m�todos
		toto.correr();
		toto.falar();
		toto.morder();

		golias.mostrarInformacoes();
	}
}
