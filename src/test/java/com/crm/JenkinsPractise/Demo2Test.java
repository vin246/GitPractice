package com.crm.JenkinsPractise;

import org.testng.annotations.Test;

public class Demo2Test {
	@Test(groups="smoke")
	public void m2() {
		System.out.println("Smoke Test");
	}

	@Test(groups="regression")
	public void m3() {
		System.out.println("Regression Test 2");
	}
}
