package org.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {

	@Test
	public void yamaha() {
		System.out.println("Yamaha");
	}

	@Ignore
	@Test
	public void bajaj() {
		System.out.println("Bajaj");
	}

	@Test
	private void ktm() {
		System.out.println("Ktm");
	}

	
	@Test(enabled = false)
	private void suzuki() {
		System.out.println("Suzuki");
	}

	@Test
	private void ford() {
		System.out.println("Ford");
	}

	@Test
	private void skoda() {
		System.out.println("Skoda");
	}

	@Test
	public void avon() {
		System.out.println("Avon");
	}

	@Test
	private void hercules() {
		System.out.println("Hercules");
	}
}
