package com.github.sonarapp;

import org.testng.annotations.Test;

public class AppTest {
	
	App app = new App();
	SecondApplication secondApplication = new SecondApplication();
	
	@Test
	public void testName() {
		String result = secondApplication.giveName();
		System.out.println("name is:" + result);
	}
	
	@Test
	public void testadd() {
		int result = app.add(5, 6);
		System.out.println("add result is:" + result);
	}
	
	@Test
	public void testGreaterNumber() {
		String result = secondApplication.giveGreaterNumber(8, 4);
		System.out.println("test result is:" + result);
	}
   
}
