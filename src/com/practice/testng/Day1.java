package com.practice.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {

	@AfterSuite
	public void alwayslastExecution() {
		System.out.println("I am no.1 always,I will execute lasttttt");
	}

	@AfterTest
	public void lastExecution() {
		System.out.println("I will execute last");
	}

	@Test
	public void Demo() {
		System.out.println("Hello World!");
	}

	@Test(groups = { "Smoke Test" })
	public void SecondTest() {
		System.out.println("Bye Bye");
	}

}
