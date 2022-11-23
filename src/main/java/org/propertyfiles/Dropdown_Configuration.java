package org.propertyfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Dropdown_Configuration {
	
	public static Properties p;
	
	public Dropdown_Configuration() throws IOException {
		File f = new File(
				"C:\\Users\\Mukesh Manivannan\\eclipse-workspace\\NewProject_Apache\\src\\main\\java\\org\\propertyfiles\\Adactin_Dropdowns.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);
	}

	public String getLocation() {

		String loc = p.getProperty("location");
		return loc;

	}

	public String getHotel(){

		String hotel = p.getProperty("hotel");
		return hotel;
			
	}

    public String getRoomType() {
		
    	String roomType = p.getProperty("roomtype");
    	return roomType;
	}
    
    public String getAdults() {

    	String adults = p.getProperty("adults");
    	return adults;
	}
    
    public String getChild() {

    	String child = p.getProperty("child");
    	return child;
	}
    
    public String getCcType() {

    	String ccType = p.getProperty("cctype");
    	return ccType;
	}
    
    public String getMonth() {

    	String month = p.getProperty("month");
    	return month;
	}
    
    public String getYear() {

    	String year = p.getProperty("year");
    	return year;
	}
    
}
