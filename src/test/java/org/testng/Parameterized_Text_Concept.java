package org.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Text_Concept {

	@Test
	@Parameters({ "username", "accountno" })
	public void login_Page(@Optional("Guru Prasath A") String username, @Optional("987654321") long accountno) {

		System.out.println("User Name:" + username);

		System.out.println("Account No:" + accountno);
	}

}
