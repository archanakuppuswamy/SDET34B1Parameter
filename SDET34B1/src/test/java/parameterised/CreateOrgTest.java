package parameterised;

import org.testng.annotations.Test;

public class CreateOrgTest {
@Test
public void createorgTest() {
	System.out.println("execute create org test");
	
	String BROWSER = System.getProperty("browser");
	String URL = System.getProperty("url");
	System.out.println(BROWSER);
	System.out.println(URL);
}
}
