package com.DEMO2;

import java.util.Random;

import org.testng.annotations.Test;

public class DEMo2 {
	
	@Test
	public void tyss() {

		System.out.println("I am an Quality Analyst");
		Random random = new Random();
		int i = random.nextInt(200);
		System.out.println(i);
	}
}
