import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CamelCaseConverterTest {

	private CamelCaseConverter camelCase;
	
	@Before
	public void setup() {
		camelCase = new CamelCaseConverter();
	}
	
	@Test
	public void deveConverterNomeSimples() throws Exception {
		assertEquals("Lionel", camelCase.converter("lionel"));
	}
	
	@Test
	public void deveConverterNomeSimplesMisturadoMaiusculoEMinusculo() throws Exception {
		assertEquals("Lionel", camelCase.converter("lIOneL"));
	}
	
}
