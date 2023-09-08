package testng_group;

import org.testng.annotations.Test;

public class Sample2 {
	@Test(groups="smoke")
	public void demo3()
	{
		System.out.println("Hi demo3");
	}
	@Test
	public void demo4()
	{
		System.out.println("HI demo4");
	}

}
