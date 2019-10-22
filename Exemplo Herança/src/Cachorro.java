/*
 * Programa��o Orientada a Objetos
 * Professor:	Orlewilson Bentes Maia
 * Data:		18/10/2019
 * Atualiza��o:	11/10/2019
 * Autor:		seu nome
 * Descri��o:	Classe para representar um cachorro
 */

public class Cachorro {

	// atributos
	private String apelido;
	private String raca;
	private float comprimento;
	private float peso;
	private String cor;

	// m�todos
	// construtor sem argumento
	public Cachorro() {
		this.apelido = "";
		this.raca = "";
		this.cor = "";
		this.comprimento = 0f;
		this.peso = 0f;
	}

	// construtor com argumentos
	public Cachorro(String apelido, String raca, String cor, float comprimento, float peso) {
		setApelido(apelido);
		setComprimento(comprimento);
		setCor(cor);
		setPeso(peso);
		setRaca(raca);
	}

	// alterar o conte�do do atributo apelido
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	// obter o conte�do do atributo apelido
	public String getApelido() {
		return this.apelido;
	}

	// alterar o conte�do do atributo raca
	public void setRaca(String raca) {
		this.raca = raca;
	}

	// obter o conte�do do atributo raca
	public String getRaca() {
		return this.raca;
	}

	// alterar o conte�do do atributo cor
	public void setCor(String cor) {
		this.cor = cor;
	}

	// obter o conte�do do atributo cor
	public String getCor() {
		return this.cor;
	}

	// alterar o conte�do do atributo comprimento
	public void setComprimento(float comprimento) {

		// verificar se o valor � positivo
		if (comprimento > 0) {
			this.comprimento = comprimento;
		} else {
			System.out.println("informe um valor de comprimento " + "positivo!");
		}
	}

	// obter o conte�do do atributo comprimento
	public float getComprimento() {
		return this.comprimento;
	}

	// alterar o conte�do do atributo peso
	public void setPeso(float peso) {

		// verificar se o valor � positivo
		if (peso > 0) {
			this.peso = peso;
		} else {
			System.out.println("Informe um valor de peso" + "positivo!");
		}
	}

	// obter o conte�do do atributo peso
	public float getPeso() {
		return this.peso;
	}

	public void falar() {
		System.out.println("latindo...");
	}

	public void correr() {
		System.out.println("correndo...");
	}

	public void morder() {
		System.out.println("mordendo...");
	}

	// imprimir os valores de cada atributo
	public void mostrarInformacoes() {
		System.out.println("Apelido: " + getApelido());
		System.out.println("Cor: " + getCor());
		System.out.println("Ra�a: " + getRaca());
		System.out.println("Comprimento: " + getComprimento());
		System.out.println("Peso: " + getPeso());
	}
}
