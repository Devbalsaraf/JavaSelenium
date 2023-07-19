package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGKeywordsUse {

	
		//invocationCount()-->sometime same test case need to executed multiple time.This is possible using testG keyword 
		
		@Test(enabled=false)
		public void test()
		{
			Reporter.log("test method is running",true);
		}
		
		
		// priority--> change the test case execution order. by default priority is 0.
		// It =ve int  or -ve int or duplicate but it can't be decimal or variable
		@Test(priority=2)
		public void a()
		{
			Reporter.log("Mehthod A is running");
		}
		@Test(priority=-1)
		public void d()
		{
			Reporter.log("Mehthod d is running");
		}
		
		//timeOut-->n test class we have multiple test case if one method is time consuming to execute then
		// testNG by default fail that tc and execute another test cses
		
		
		@Test(timeOut=1000)
		public void b() throws InterruptedException
		{
			Reporter.log("mehtod b is running");
			Thread.sleep(500);
		}
		
		// If one TC execution depends on multiple TC then we can use dependsOnMethods keyword
		@Test(dependsOnMethods="b")
		public void c()
		{
			Reporter.log("mehthod c is running" );
		}
	}


