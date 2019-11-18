
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
