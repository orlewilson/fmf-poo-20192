/*
 * Programa��o Orientada a Objetos
 * Professor:	Orlewilson Bentes Maia
 * Data:		21/10/2019
 * Atualiza��o:	23/10/2019
 * Autor:		seu nome
 * Descri��o:	Exemplificar exemplo heran�a
 */
public class Main {

	public static void main(String[] args) {
		
		// criando objetos
		Cachorro pimpolho = new Cachorro();
		Coelho pernalonga = new Coelho();
				
		pimpolho.setApelido("Pimpolho");
		pimpolho.setCor("preto");
		pimpolho.setRaca("viralata");
		pimpolho.setComprimento(1);
		pimpolho.falar();
		
		pernalonga.setApelido("Pernalonga");
		pernalonga.setCor("branco");
		pernalonga.setTamanhoDente(30);
		pernalonga.setTamanhoOrelha(60);
		pernalonga.falar();
	}
}
