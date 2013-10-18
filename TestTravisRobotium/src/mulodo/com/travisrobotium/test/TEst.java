package mulodo.com.travisrobotium.test;

import android.test.ActivityTestCase;

public class TEst extends ActivityTestCase {
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
	}

	public void test() {
		System.out.println("Hello I'm Son");
		assertEquals(1, 1);
		assertEquals("A", "A");
		int a = 2;
		assertEquals(a, 2);
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}
}
