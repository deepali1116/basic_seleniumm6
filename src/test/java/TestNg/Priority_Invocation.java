package TestNg;

import org.testng.annotations.Test;

public class Priority_Invocation {
	//1.TestNg main method
	@Test (priority=-1)
	public void demo()
	{
		System.out.println("Hi Demo1");
	}

	//2.TestNg main method
		@Test (invocationCount=3,enabled=false)
		public void demo1()
		{
		System.out.println("Hi Demo2");	
		}
 //3.TestNg main method
	@Test(priority=-5,invocationCount=2)
	public void demo3()
    {
		System.out.println("Hi Demo3");
	}
	//3.TestNg main method
	@Test(priority=-2,invocationCount=0)
	public void demo4()
    {
		System.out.println("Hi Demo4");
	}
	
	
	

}
