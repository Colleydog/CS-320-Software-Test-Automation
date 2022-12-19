package ModuleThreeMilestone;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ContactTest {
	
	Contact person = new Contact("Ethan","Colley","1234567899","123 Austin Street", 1234);
	Contact wrongPerson = new Contact("EthanColley","EthanColley","123456","3213213213213213213213213213211", 1456);
	
//Commenting out each Assertion in each test case independently
	@Test
	void testGetFirstName() {
		//Should Pass: Does
		//Assert.assertTrue(person.getFirstName() == "Ethan");
		//Should Fail: Does
		Assert.assertTrue(wrongPerson.getFirstName() == "EthanColley");
	}

	@Test
	void testGetLastName() {
		//Should Pass: Does
		//Assert.assertTrue(person.getLastName() == "Colley");
		//Should Fail: Does
		Assert.assertTrue(wrongPerson.getLastName() == "EthanColley");
	}

	@Test
	void testGetNumber() {
		//Should Pass: Does
		//Assert.assertTrue(person.getNumber() == "1234567899");
		//Should Fail: Does
		Assert.assertTrue(wrongPerson.getNumber() == "123456");
	}

	@Test
	void testGetAddress() {
		//Should Pass: Does
		//Assert.assertTrue(person.getAddress() == "123 Austin Street");
		//Should Fail: Does
		Assert.assertTrue(wrongPerson.getAddress() == "3213213213213213213213213213211");
	}

	@Test
	void testGetId() {
		//Should Pass: Does
		Assert.assertTrue(person.getId() == 1234);
		
	}
	
}
