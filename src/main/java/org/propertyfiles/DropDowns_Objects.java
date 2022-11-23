package org.propertyfiles;

import java.io.IOException;

public class DropDowns_Objects {

	private DropDowns_Objects() {

	}
	
	public Dropdown_Configuration getDropDown_Con() throws IOException {

		Dropdown_Configuration dc = new Dropdown_Configuration();

		return dc;
	}

	public static DropDowns_Objects getDropDown_obj() {
  
		DropDowns_Objects ddo = new DropDowns_Objects();
		
		return ddo;
	}

}
