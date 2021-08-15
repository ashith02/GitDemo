package com.practice.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day2 {

	@AfterClass
	public void afclass() {
		System.out.println("Execution at the end of all method run");
	}

	@BeforeMethod
	public void methodFirst() {
		System.out.println("Method executed before test");
	}

	@AfterMethod
	public void methodLat() {
		System.out.println("Method executed after test");
	}

	@Test(groups = { "Smoke Test" })
	public void pLoan() {
		System.out.println("Good");
	}

	@BeforeClass
	public void befclass() {
		System.out.println("Execution before all method run");
	}

}
