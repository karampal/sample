package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FreecrmLogin {
	
	@Test
	public void loginTest()
	{
		Assert.assertEquals("kp", "kp", "These are not equal");
	}

}
