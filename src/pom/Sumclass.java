package pom;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class Sumclass {

	@Test
	@Parameters("a")
	public void sum( String a) {
		//String sum = a;
		System.out.println(a);
	}
	
	
	
}
