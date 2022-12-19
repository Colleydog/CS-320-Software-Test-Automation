package ModuleThreeMilestone;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ContactServicesTest {
	ContactServices service;
	@Test
	void testAddContact() {
		service.addContact("Ethan","Colley","1234567899","123 Austin Street", 1234);
		Assert.assertTrue(service.contacts.size() == 1);
		
	}

	@Test
	void testDeleteContact() {
		service.deleteContact(1234);
		Assert.assertNull(service.contacts);
	}

}
