/*
 * Disciplina: 	Programação Orientada a Objetos
 * Prof.:		Orlewilson B. Maia
 * Autor:		Seu nome
 * Data:		30/08/2019
 * Atualização:	27/09/2019
 * Descrição:	Exemplo Classe sem e com encapsulamento
 * 
 * */

public class Main {

	public static void main(String[] args) {

		// criar objetos
		Cachorro toto = new Cachorro();
		
		// alterando conteúdo dos atributos (sem encapsulamnto)
//		toto.apelido = "toto";
//		toto.comprimento = 1.2f;
//		toto.cor = "amarelo";
//		toto.peso = 20f;
//		toto.raca = "pinch";
		
		// alterando conteúdo dos atributos (com encapsulamento)
		toto.setApelido("toto");
		toto.setComprimento(1.2f);
		toto.setCor("amarelo");
		toto.setPeso(20f);
		toto.setRaca("pinch");
			
		
//		// mostrar conteúdos dos atributos (sem encapsulamnto)
//		System.out.println("Apelido: " + 
//		toto.apelido);
//		
//		System.out.println("Comprimento: " + 
//				toto.comprimento);
//		
//		System.out.println("Cor: " + 
//				toto.cor);
//		
//		System.out.println("Peso: " + 
//				toto.peso);
//		
//		System.out.println("Raça: " + 
//				toto.raca);

		// mostrar conteúdos dos atributos (com encapsulamnto)
//		System.out.println("Apelido: " + 
//		toto.getApelido());
//		
//		System.out.println("Comprimento: " + 
//				toto.getComprimento());
//		
//		System.out.println("Cor: " + 
//				toto.getCor());
//		
//		System.out.println("Peso: " + 
//				toto.getPeso());
//		
//		System.out.println("Raça: " + 
//				toto.getRaca());
		
		// mostrar dados do cachorro
		toto.mostrarInformacoes();

		// chamando os métodos
		toto.correr();
		
		toto.morder();
		
		toto.latir();
	}
}
