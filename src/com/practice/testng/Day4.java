package com.practice.testng;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {

	@Test
	public void webHomeLoan() {
		System.out.println("Web Home Running");
	}

	@Parameters({ "URL" })
	@Test
	public void mobileHomeLoan(String uname) {
		System.out.println("Mobile Home Running");
		System.out.println(uname);
	}

	@Test(groups = { "Smoke Test" })
	public void apiHomeLoan() {
		System.out.println("API Home Running");
	}

	@BeforeTest
	public void firstExecution() {
		System.out.println("I will execure first");
	}

	@BeforeSuite
	public void alwaysfirstExecution() {
		System.out.println("I am no.1, will execure first");
	}
}
