package org.testng;

import org.testng.annotations.Test;

public class Dependency_Concept {

	@Test
	public void searchPhotosInGallery() {
		System.out.println("Search Photo");
	}
	@Test (dependsOnMethods = "searchPhotosInGallery")
	public void uploadPhoto() {
		System.out.println("Upload Photo");
	}
	
}
