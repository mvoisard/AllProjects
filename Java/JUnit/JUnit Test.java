import static org.junit.Assert.*;

import org.junit.Test;

public class Sep4bTest {

	@Test
	public void testAdd1() {
		int result = Sep4b.add(5, 7);
		assertEquals(12, result);
	}

	@Test
	public void testAdd2() {
		int result = Sep4b.add(-5, 7);
		assertEquals(2, result);
	}
	
	@Test
	public void testAdd3() {
		int result = Sep4b.add(5, -7);
		assertEquals("positive-negative test", -2, result);
	}
	
	@Test
	public void testAdd4() {
		int result = Sep4b.add(-5, -7);
		assertEquals(-12, result);
	}
	
	@Test
	public void testAdd5() {
		int result = Sep4b.add(5, 0);
		assertEquals(5, result);
	}
}
