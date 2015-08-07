import static org.junit.Assert.*;

import org.junit.Test;


public class ComboLockTest {
	
	ComboLock lock1 = new ComboLock(13,23,33);

	@Test
	public void comboLockConstructorTest() {
	
		assertEquals(13,lock1.getSecret1());
		assertEquals(23,lock1.getSecret2());
		assertEquals(33,lock1.getSecret3());
	}
	
	@Test
	public void resetTest() {
		
		assertEquals(0,lock1.reset());
	}
	
	@Test
	public void scrollTest1() {
		
		assertEquals(1,lock1.scroll(40));
	}
	
	@Test
	public void scrollTest2() {
		
		assertEquals(23,lock1.scroll(23));
	}
	
	@Test
	public void scrollTest3() {
		
		assertEquals(35,lock1.scroll(-5));
	}
	
	@Test
	public void shouldUnlockTest() {
		
	}
	
	@Test
	public void turnLeftTest() {
		
	}
	
	@Test
	public void turnRightTest() {
		
	}

}
