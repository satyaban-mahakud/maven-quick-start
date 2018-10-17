package clinic.programming.training;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class ApplicationTest {
	private Application app;

	@Before
	public void setup() {
		app = new Application();
	}
	
	@Test 
	public void EmptyStringTest()
	{
		assertEquals(0, app.countWords(""));
	}
	
	@Test 
	public void nullValueTest()
	{
		assertEquals(0, app.countWords(null));
	}
	
	@Test 
	public void wordcountTest()
	{
		assertEquals(11, app.countWords("Today is Wednesday. Next 1 day to go for long weekdend."));
	}	
	
}
