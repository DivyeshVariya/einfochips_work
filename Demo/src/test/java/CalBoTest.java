import static org.junit.Assert.*;

import org.junit.Test;

public class CalBoTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	@Test
	public void testPositive() {
		CalBo cb = new CalBo();
		int k=cb.add(20,10);
		assertEquals(k,30);
	}
	@Test
	public void testGetAll()
	{
		CalBo cb = new CalBo();
		int k=cb.getAll().size();
		assertEquals(k,2);
	}
}
