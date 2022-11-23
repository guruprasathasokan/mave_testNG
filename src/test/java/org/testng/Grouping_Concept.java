package org.testng;

import org.testng.annotations.Test;

public class Grouping_Concept {

	@Test(groups = "Bikes", priority = 0)
	public void yamaha() {
		System.out.println("Yamaha");
	}
	
	@Test (groups = "Bikes", priority = 1)
	public void bajaj() {
		System.out.println("Bajaj");
	}
	
	@Test (groups = "Bikes", priority = 2)
	private void ktm() {
		System.out.println("Ktm");
	}
	
	@Test (groups = "Cars", priority = 3)
	private void suzuki() {
		System.out.println("Suzuki");
	}
	
	@Test (groups = "Cars", priority = 4)
	private void ford() {
		System.out.println("Ford");
	}
	
	@Test(groups = "Cars", priority = 5)
	private void skoda() {
		System.out.println("Skoda");
	}
	
	@Test (groups = "Bicycle", priority = 6)
	public void avon() {
		System.out.println("Avon");
	}
	
	@Test(groups = "Bicycle", priority = 7)
	private void hercules() {
		System.out.println("Hercules");
	}
}
