/*
 * Programa��o Orientada a Objetos
 * Professor:	Orlewilson Bentes Maia
 * Data:		22/09/2019
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

		// acessando atributos (sem encapsulamento)
//		toto.apelido = "Tot�";
//		toto.comprimento = 1.32f;
//		toto.cor = "marrom";
//		toto.peso = 0.8f;
//		toto.raca = "viralata";

		// acessando atributos (com encapsulamento)
		toto.setApelido("Tot�");
		toto.setComprimento(1.32f);
		toto.setCor("marrom");
		toto.setPeso(0.8f);
		toto.setRaca("viralata");

		// imprimir o conte�do de cada atributo (sem encapsulamento)
//		System.out.println("Apelido: " + toto.apelido);
//		System.out.println("Ra�a: " + toto.raca);
//		System.out.println("Cor: " + toto.cor);
//		System.out.println("Comprimento: " + toto.comprimento);
//		System.out.println("Peso: " + toto.peso);

		// imprimir o conte�do de cada atributo (com encapsulamento)
//		System.out.println("Apelido: " + toto.getApelido());
//		System.out.println("Ra�a: " + toto.getRaca());
//		System.out.println("Cor: " + toto.getCor());
//		System.out.println("Comprimento: " + toto.getComprimento());
//		System.out.println("Peso: " + toto.getPeso());

		// imprimir o conte�do de cada atributo
		toto.mostrarInformacoes();

		// chamar os m�todos
		toto.correr();
		toto.latir();
		toto.morder();

		golias.mostrarInformacoes();
	}
}
