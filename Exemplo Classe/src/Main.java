/*
 * Programação Orientada a Objetos
 * Professor:	Orlewilson Bentes Maia
 * Data:		22/09/2019
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

		// acessando atributos (sem encapsulamento)
//		toto.apelido = "Totó";
//		toto.comprimento = 1.32f;
//		toto.cor = "marrom";
//		toto.peso = 0.8f;
//		toto.raca = "viralata";

		// acessando atributos (com encapsulamento)
		toto.setApelido("Totó");
		toto.setComprimento(1.32f);
		toto.setCor("marrom");
		toto.setPeso(0.8f);
		toto.setRaca("viralata");

		// imprimir o conteúdo de cada atributo (sem encapsulamento)
//		System.out.println("Apelido: " + toto.apelido);
//		System.out.println("Raça: " + toto.raca);
//		System.out.println("Cor: " + toto.cor);
//		System.out.println("Comprimento: " + toto.comprimento);
//		System.out.println("Peso: " + toto.peso);

		// imprimir o conteúdo de cada atributo (com encapsulamento)
//		System.out.println("Apelido: " + toto.getApelido());
//		System.out.println("Raça: " + toto.getRaca());
//		System.out.println("Cor: " + toto.getCor());
//		System.out.println("Comprimento: " + toto.getComprimento());
//		System.out.println("Peso: " + toto.getPeso());

		// imprimir o conteúdo de cada atributo
		toto.mostrarInformacoes();

		// chamar os métodos
		toto.correr();
		toto.latir();
		toto.morder();

		golias.mostrarInformacoes();
	}
}
