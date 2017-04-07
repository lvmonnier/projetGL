package fr.univ.tp;

import java.util.logging.Logger;

import org.junit.*;
//import org.junit.rules.ExpectedException;

public class StringUtilsTest {
	private static Logger log = Logger.getLogger(MyFirstTest.class.getSimpleName());
	
	/*
	@Rule
	public ExpectedException exc = ExpectedException.none();
	*/
	
	@Test
	public void reverseStringTestCasNominal() {
		log.info("Test de la méthode reverseStringTest pour la chaine \"test\"");
		Assert.assertEquals("tset", StringUtils.reverseString("test"));
	}
	
	@Test
	public void reverseStringTestCasVide() {
		log.info("Test de la méthode reverseStringTest pour une chaine vide");
		Assert.assertEquals("", StringUtils.reverseString(""));
	}
	
	@Test
	public void reverseStringTestCasSingle() {
		log.info("Test de la méthode reverseStringTest pour un seul caractère");
		Assert.assertEquals("a", StringUtils.reverseString("a"));
	}
	
	/*
	@Test
	public void reverseStringTestCasNonString() {
		log.info("Test de la méthode reverseStringTest pour un mauvais argument (non string)");
		//exc.expect(IllegalArgumentException.class);
		//assertThrown()
		//when(su).reverseString(354);
		/*try {
	        su.reverseString(156);
	        assert false;
	    } catch (IndexOutOfBoundsException e) {
	        assert true;
	    }
	}
	*/

}
