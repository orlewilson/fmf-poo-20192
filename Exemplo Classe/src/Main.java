/*
 * Disciplina: 	Programação Orientada a Objetos
 * Prof.:		Orlewilson B. Maia
 * Autor:		Seu nome
 * Data:		30/08/2019
 * Descrição:	Exemplo Classe
 * 
 * */

public class Main {

	public static void main(String[] args) {

		// criar objetos
		Cachorro toto = new Cachorro();
		
		// alterando conteúdo dos atributos
		toto.apelido = "toto";
		toto.comprimento = 1.2f;
		toto.cor = "amarelo";
		toto.peso = 20f;
		toto.raca = "pinch";
	
		// mostrar conteúdos dos atributos
		System.out.println("Apelido: " + 
		toto.apelido);
		
		System.out.println("Comprimento: " + 
				toto.comprimento);
		
		System.out.println("Cor: " + 
				toto.cor);
		
		System.out.println("Peso: " + 
				toto.peso);
		
		System.out.println("Raça: " + 
				toto.raca);
		
		// chamando os métodos
		toto.correr();
		
		toto.morder();
		
		toto.latir();
		
		
	}
}









