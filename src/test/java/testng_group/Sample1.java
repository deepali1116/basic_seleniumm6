package testng_group;

import org.testng.annotations.Test;

public class Sample1 {
	@Test
	public void demo1()
	{
		System.out.println(" HI demo1");
	}
	@Test(groups="smoke")
	
	public void demo2()
	{
		
		System.out.println(" HI demo2");
	}
	

}
