package ModuleThreeMilestone;

public class Contact {
	
	private String firstName;
	private String lastName;
	private String number;
	private String address;
	private int id;
	
	protected Contact(String firstName, String lastName, String number, String address, int id) {
		setFirstName(firstName);
		setLastName(lastName);
		setNumber(number);
		setAddress(address);
		setId(id);
	}
	

	//*******************************************************************************************
	// setter functions
	
	public void setFirstName(String name) {
		if(name.length() <= 10 && name != null)
			this.firstName = name;
	}
	
	public void setLastName(String name) {
		if(name.length() <= 10 && name != null)
			this.lastName = name;
	}
	
	public void setNumber(String number) {
		if(number.length() == 10 && number != null)
			this.number = number;
	}
	
	public void setAddress(String address) {
		if(address.length() <= 30 && address != null)
			this.address = address;
	}
	
	private void setId(int id) {
		String tempString = Integer.toString(id);
		if(tempString.length() <=  10 && tempString != null)
			this.id = id;
	}
	
	//*******************************************************************************************
	// getter functions
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getNumber() {
		return number;
	}
	
	public int getId() {
		return id;
	}
}
