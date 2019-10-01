/*
 * Disciplina: 	Programação Orientada a Objetos
 * Prof.:		Orlewilson B. Maia
 * Autor:		Seu nome
 * Data:		30/08/2019
 * Atualização:	27/09/2019
 * Descrição:	Classe para representar um
 * 				cachorro sem encapsulamento e com encapsulamento
 * 
 * */

public class Cachorro {

	// atributos (sem encapsulamento)
//	String raca;
//	String cor;
//	float comprimento;
//	float peso;
//	String apelido;
	
	// atributos (com encapsulamento)
	private String raca;
	private String cor;
	private float comprimento;
	private float peso;
	private String apelido;

	// métodos
	// alterar conteúdo do atributo raca
	public void setRaca(String raca) {
		this.raca = raca;
	}

	// obter conteúdo do atributo raca
	public String getRaca() {
		return this.raca;
	}

	// alterar conteúdo do atributo cor
	public void setCor(String cor) {
		this.cor = cor;
	}

	// obter conteúdo do atributo cor
	public String getCor() {
		return this.cor;
	}

	// alterar conteúdo do atributo apelido
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	// obter conteúdo do atributo apelido
	public String getApelido() {
		return this.apelido;
	}

	// alterar conteúdo do atributo comprimento
	public void setComprimento(float comprimento) {

		// verifiicar se comprimento é > 0
		if (comprimento > 0) {
			this.comprimento = comprimento;
		} else {
			System.out.println("informe um valor positivo");
		}
	}

	// obter conteúdo do atributo comprimento
	public float getComprimento() {
		return this.comprimento;
	}

	// alterar conteúdo do atributo peso
	public void setPeso(float peso) {

		if (peso > 0) {
			this.peso = peso;
		} else {
			System.out.println("informe um valor positivo");
		}
	}

	// obter conteúdo do atributo peso
	public float getPeso() {
		return this.peso;
	}

	void latir() {
		System.out.println("Au, au!!!!");
	}

	void correr() {
		System.out.println("correndo...");
	}

	void morder() {
		System.out.println("mordendo...");
	}

	// mostrar informações dos atributos
	public void mostrarInformacoes() {
		System.out.println("Apelido: " + getApelido());
		System.out.println("Raça: " + getRaca());
		System.out.println("Cor: " + getCor());
		System.out.println("Peso: " + getPeso());
		System.out.println("Comprimento: " + getComprimento());
	}
}
