package mulodo.com.travisrobotium.test;

import mulodo.com.travisrobotium.MainActivity;
import android.test.ActivityInstrumentationTestCase2;

import com.jayway.android.robotium.solo.Solo;

public class TestMainActivity extends
		ActivityInstrumentationTestCase2<MainActivity> {

	private Solo mSolo;

	public TestMainActivity() {
		super(MainActivity.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		mSolo = new Solo(getInstrumentation(), getActivity());
		super.setUp();
	}

	public void test_01() {
		mSolo.assertCurrentActivity("MainActivity", MainActivity.class);
		mSolo.enterText(0, "");
		mSolo.enterText(0, "Hello Robotium");
		mSolo.clickOnButton("Click");
		
		assertEquals(1, 1);
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		mSolo.finishOpenedActivities();
		super.tearDown();
	}
}
