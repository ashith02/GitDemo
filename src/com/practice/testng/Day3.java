package com.practice.testng;

import org.testng.annotations.Test;

public class Day3 {

	@Test
	public void webCarLoan() {
		System.out.println("Web Car Running");
	}

	@Test
	public void mobileCarLoan() {
		System.out.println("Mobile Car Running");
	}

	@Test(groups = { "Smoke Test" })
	public void mobileCarLoanLogin() {
		System.out.println("Mobile Car Running");
	}

	@Test
	public void mobileCarLoanLogout() {
		System.out.println("Mobile Car Running");
	}

	@Test
	public void mobileCarLoanInterest() {
		System.out.println("Mobile Car Running");
	}

	@Test
	public void apiCarLoan() {
		System.out.println("API Car Running");
	}
}
