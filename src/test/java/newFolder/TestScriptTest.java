package newFolder;

import org.testng.annotations.Test;

public class TestScriptTest {
	
	@Test
	public void scriptTest()
	{
		String bro = System.getProperty("browser");
		String En = System.getProperty("Env");
		
		System.out.println(bro);
		System.out.println(En);
	}

}
