import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author thoms
 *
 */
class CalculsTest {

	private Calculs c = null;
	private Calculs c1 = null;
	
	@BeforeEach
	void setUP() throws Exception {
		c = new Calculs(2,4);
		c1 = new Calculs(20,40);
	}
	
	/**
	 * Test method for {@link Calculs#Calculs(int, int)}.
	 */
	@Test
	void testCalculs() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Calculs#multiplier()}.
	 */
	@Test
	void testMultiplier() {
		if (c.multiplier()  != 8) 
		{
		fail("Not yet implemented");
		}
		assertEquals(c1.multiplier(), 800);
		
	}

	/**
	 * Test method for {@link Calculs#additionner()}.
	 */
	@Test
	void testAdditionner() {
		assertEquals(c.additionner(), 6);
		assertEquals(c1.additionner(), 60);
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Calculs#diviser()}.
	 */
	@Test
	void testDiviser() {
		assertEquals(c.diviser(), 0);
		assertEquals(c1.diviser(), 0);
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Calculs#soustraire()}.
	 */
	@Test
	void testSoustraire() {
		assertEquals(c.soustraire(), -2);
		assertEquals(c1.soustraire(), -20);
		//fail("Not yet implemented");
	}

}
