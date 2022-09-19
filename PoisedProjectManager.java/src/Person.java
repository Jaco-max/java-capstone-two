
public class Person {
	private String name;
	private String surname;
	private String jobTitle;
	private String email;
	private String contactNumber;
	private String address;
	
	//Create Person Object
	public Person(String name, String surname, String jobTitle,
				  String email, String contactNumber, String address) {
		this.name = name;
		this.surname = surname;
		this.jobTitle = jobTitle;
		this.email = email;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
	
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getContactNumber() {
		return contactNumber;
	}
	
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public String toStr() {
		String displayString = "Contractor Name: "
							   + name + "\n"
							   + "Contractor Surname: "
							   + surname + "\n"
							   + "Job Title: "
							   + jobTitle + "\n"
							   + "email address: "
							   + email + "\n"
							   + "Contact Number: "
							   + contactNumber + "\n"
							   + "Contractor Address: "
							   + address + "\n";
		return displayString;
	}
}
