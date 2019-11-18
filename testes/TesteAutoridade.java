import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteAutoridade {

	
	
	
	@Test
	void testeInformal() {
		
		Autoridade exemplo = new Autoridade("Clarissa", "Andrade", new Informal());
		String nome = exemplo.getTratamento();
		assertEquals("Clarissa", nome);	
	}
	
	@Test
	void testeRespeitoso() {
		
		Autoridade exemplo = new Autoridade("Clarissa", "Andrade", new Respeitoso("feminino"));
		String nome = exemplo.getTratamento();
		assertEquals("Sra. Andrade", nome);		
	}

	@Test
	void testeComTitulo() {
		
		Autoridade exemplo = new Autoridade("Clarissa", "Andrade", new ComTitulo("Excelentissima"));
		String nome = exemplo.getTratamento();
		assertEquals("Excelentissima Clarissa Andrade", nome);	
	}
	
}
