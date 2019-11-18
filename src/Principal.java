/*Crie uma interface chamada FormatadorNome que possui o m�todo String formatarNome(String nome, String sobrenome).

Crie uma classe chamada Autoridade que possui atributos como nome, sobrenome e uma inst�ncia de FormatadorNome. Essa
classe deve possuir um m�todo getTratamento() que delega a formata��o do nome para a inst�ncia de FormatadorNome.

Crie a seguintes implementa��es da interface FormatadorNome:
Informal: retorna somente o primeiro nome
Respeitoso: deve receber em seu construtor a informa��o se � masculino ou feminino, e retornar "Sr." ou "Sra." 
seguido do sobrenome
ComT�tulo: deve receber em seu construtor o t�tulo e retornar o t�tulo seguido de nome e sobrenome. 
Exemplo: "Magn�fico Pedro Cabral"

Crie testes de unidade que fazem os testes da classe Autoridade com cada uma das implementa��es da interface.
 */

public class Principal {

	public static void main(String[] args) {
	
	Autoridade exemplo = new Autoridade("Clarissa", "Andrade", new Respeitoso("feminino"));
	Autoridade exemplo2 = new Autoridade("Clarissa", "Andrade", new ComTitulo("Excelentissima"));
	Autoridade exemplo3 = new Autoridade("Clarissa", "Andrade", new Informal());
	
	
	System.out.println(exemplo.getTratamento());
	System.out.println(exemplo2.getTratamento());
	System.out.println(exemplo3.getTratamento());
	
	}

}
