package com.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	
	
	
	@Test( priority = 1)

	
	public void Test1() {
		System.out.println("TEST1");
	}
	
	@Test (priority = 2)

	
	public void Test2() {
		
		System.out.println("TEST2");}
		
		
		@Test (priority = 3)
		
		public void Test3() {
			System.out.println("TEST3");
		}
	}

