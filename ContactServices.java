package ModuleThreeMilestone;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactServices extends Contact {
	
	public ArrayList<Contact> contacts = new ArrayList<>();
	
	protected ContactServices(String firstName, String lastName, String number, String address, int id) {
		super(firstName, lastName, number, address, id);
		
		// TODO Auto-generated constructor stub
	}

	
	
	public void addContact(String firstName, String lastName, String number, String address, int id) {
		
		Contact person = new Contact(firstName, lastName, number, address, id);
		
		contacts.add(person);
	}
	
	
	public void deleteContact( int id) {
		for (Contact contact: contacts) {
			if(contact.getId() == id) {
				contacts.remove(contact);
			}
		}
	}
	

	public void updateContact(int id) {
		Scanner input = new Scanner(System.in);
		int selection;
		String phrase;
		for (Contact contact: contacts) {
			if(contact.getId() == id) {
				System.out.println("Select an Option below:");
				System.out.println("1) Change first name");
				System.out.println("2) Change last name");
				System.out.println("3) Change number");
				System.out.println("4) Change address");
				System.out.println("5) EXIT");
				selection = input.nextInt();
				while(selection >= 1 && selection <= 4) {
					
					switch (selection){
						case 1:
							phrase = input.nextLine();
							contact.setFirstName(phrase);
							break;
						case 2:
							phrase = input.nextLine();
							contact.setLastName(phrase);
							break;
						case 3:
							phrase = input.nextLine();
							contact.setNumber(phrase);
							break;
						case 4:
							phrase = input.nextLine();
							contact.setAddress(phrase);
							break;
						case 5:
							break;
						default:
							System.out.println("Wrong input");	
					}
					System.out.println("Select an Option below:");
					System.out.println("1) Change first name");
					System.out.println("2) Change last name");
					System.out.println("3) Change number");
					System.out.println("4) Change address");
					System.out.println("5) EXIT");
					selection = input.nextInt();
				}
		input.close();
			}
		}
	}
	
}
