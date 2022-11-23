package org.propertyfiles;

import java.io.IOException;

public class Adactin_Objects {

	private Adactin_Objects() {
		
	}
	
	public static Adactin_Objects getAdactin_Objects() {
 
		Adactin_Objects ao = new Adactin_Objects();
		return ao;
		
	}
	
	public Adactin_Configuration getAdactin_Configuration() throws IOException {

		Adactin_Configuration ac = new Adactin_Configuration();
		return ac;
	}
}
