package example;
import org.junit.Assert;
import org.junit.Test;

public class CalTest{
	@Test
	public void Testbasic(){
		
		//Assert.assertEquals("y","y");
		Assert.assertEquals(5,Calculator.add(3,2));
		Assert.assertEquals(10,Calculator.add(5,5));
		
		Assert.assertEquals(1,Calculator.sub(3,2));
		Assert.assertEquals(0,Calculator.sub(5,5));
		
		Assert.assertEquals(6,Calculator.multiply(3,2));
		Assert.assertEquals(5,Calculator.multiply(5,1));
		
		Assert.assertEquals(2,Calculator.divide(4,2));
		Assert.assertEquals(1,Calculator.divide(3,3));
	}
	
}
