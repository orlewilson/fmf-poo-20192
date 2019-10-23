/*
 * Programação Orientada a Objetos
 * Professor:	Orlewilson Bentes Maia
 * Data:		21/10/2019
 * Atualização:	23/10/2019
 * Autor:		seu nome
 * Descrição:	Classe para representar um animal
 */
// não permite criar objetos a partir de uma classe
// abstrata
public abstract class Animal {

	// atributos
	private String apelido;
	private String cor;
	
	// construtores sem argumento e com argumento
	public Animal() {
		this.apelido = "";
		this.cor = "";
	}
	
	public Animal(String apelido, String cor) {
		this.apelido = apelido;
		this.cor = cor;
	}
	
	// métodos
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	public String getApelido() {
		return this.apelido;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public void falar() {
		System.out.println("falar algo...");
	}
}
