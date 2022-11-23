package org.propertyfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Adactin_Configuration {

	public static Properties p;

	public Adactin_Configuration() throws IOException {
		File f = new File(
				"C:\\Users\\Mukesh Manivannan\\eclipse-workspace\\NewProject_Apache\\src\\main\\java\\org\\propertyfiles\\Adactin_Hotel.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);

	}

	public String getUrl() throws IOException {

		String url = p.getProperty("url");
		return url;
	}

	public String getUserName() throws IOException {

		String username = p.getProperty("username");
		return username;

	}

	public String getPassword() throws IOException {

		String password = p.getProperty("password");

		return password;

	}

	public String getCheckInDate() {

		String checkInDate = p.getProperty("checkInDate");
		return checkInDate;
	}

	public String getCheckOutDate() {

		String checkOutDate = p.getProperty("checkoutDate");
		return checkOutDate;
	}

	public String getFirstName() {

		String firstName = p.getProperty("firstName");
		return firstName;
	}

	public String getLastName() {

		String lastName = p.getProperty("lastName");
		return lastName;
	}

	public String getAddress() {

		String address = p.getProperty("address");
		return address;
	}

	public String getCreditCard() {

		String cc = p.getProperty("credictCard");
		return cc;
	}

	public String getCvv() {

		String cvv = p.getProperty("cvv");
		return cvv;
	}
}
