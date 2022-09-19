import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		//Variables used to create Project object are initialized
		String projectNumber = "";
		String projectName = "";
		String buildingType = "";
		String buildingAddress = "";
		String erfNumber = "";
		String deadline = "";
		String totalCost = "";
		String totalPaid = "";
		boolean finalised = false;
		
		Project newBuilding = new Project("", "",
							  "", "", "", "", 0.0, 0, false);
		
		// Input from the user is assigned to the project object, inside a try block
		try {	
		System.out.println("_ _ Please capture details for the new "
							+ "project below _ _\n");
		
		System.out.println("- Please enter the project number "
							+ "for the new project: ");
		projectNumber = userInput.nextLine();
		
		System.out.println("- Please enter the name for "
							+ "the project: ");
		projectName = userInput.nextLine();
		
		System.out.println("- Please enter the type of building: ");
		buildingType = userInput.nextLine();
		
		System.out.println("- Please enter the address of the building: ");
		buildingAddress = userInput.nextLine();
		
		System.out.println("- Please enter the ERF number for the project: ");
		erfNumber = userInput.nextLine();
		
		System.out.println("- Please enter the deadline for the project: ");
		deadline = userInput.nextLine();
		
		System.out.println("- Please enter the total fee for the project: ");
		totalCost = userInput.nextLine();
		
		System.out.println("- Please enter the total fee paid to date: ");
		totalPaid = userInput.nextLine();
		
		finalised = false;
		
		} catch(Exception e) {
			System.out.println("Incorrect Input");
		}
		
		try {
			newBuilding = new Project(projectNumber, projectName, 
			buildingType, buildingAddress, 
			erfNumber, deadline, 
			Double.parseDouble(totalCost), 
			Double.parseDouble(totalPaid), finalised);
		
		} catch (Exception e) {
			System.out.println("Project could not be created");
		}
		
		// Input taken from the user is assigned to the person object
		System.out.println("\n_ _ Please capture details for the "
				+ "contractor below _ _\n");
		
		System.out.println("- Please enter the name of the contractor");
		String name = userInput.nextLine();
		
		System.out.println("- Please enter the surname of the contractor");
		String surname = userInput.nextLine();
		
		System.out.println("- Please enter the Job Title of the contractor");
		String jobTitle = userInput.nextLine();
		
		System.out.println("- Please enter the email address of"
							+ " the contractor");
		String email = userInput.nextLine();
		
		System.out.println("- Please enter the contact number "
							+ "of the contractor");
		String contact = userInput.nextLine();
		
		System.out.println("- Please enter the contractor's "
							+ "physical address:");
		String contractorAddress = userInput.nextLine();
		
		Person newPerson = new Person(name, surname, jobTitle, email,
				  contact, contractorAddress);
		
		boolean chosen = true;
		
		String menuOption = "";
		
		// While loop allows user to choose multiple options before exiting
		while (chosen) {
			
			System.out.println("\nPlease select one of the following options: \n" 
					+ "CHD - Change Due Date \n"
					+ "CHF - Change Total fee paid to date \n"
					+ "CHC - Change Contractor's Contact Details \n"
					+ "FN - Finalise Captured Project\n"
					+ "VB - View Building\n"
					+ "VC - View Contractor\n"
					+ "E - Exit\n");

			menuOption = userInput.next();
			menuOption = menuOption.toUpperCase();
		
			if (menuOption.equals("CHD")) {
				System.out.println("- Please enter the new date:\n");
				String newDate = userInput.next();
				newBuilding.setDeadline(newDate);
				System.out.println("- New deadline is: \n" + newDate);
			
			}
		
			else if (menuOption.equals("CHF")) {
				System.out.println("- Please enter the Total fee "
									+ "paid to date :\n");
				double newAmount = Double.parseDouble(
									userInput.next());
				newBuilding.setTotalPaid(newAmount);
				System.out.println("- Amount paid to date: R"
								+ newAmount + "\n");
			}
		
			else if (menuOption.equals("CHC")) {
				System.out.println("Please enter the new Telephone number: \n");
				String newContactNumber = userInput.next();
				newPerson.setContactNumber(newContactNumber);
				System.out.println("- Please enter the new email addres: \n");
				String newEmail = userInput.next();
				newPerson.setEmail(newEmail);
				System.out.println("- New contact details saved\n");
			}
		
			else if (menuOption.equals("FN")) {
				newBuilding.setFinalised(true);
				System.out.println("\n--Project has been Finalised--\n");
			}
			
			else if(menuOption.equals("VB")) {
				System.out.println("\t-- Building Details --\n");
				System.out.println(newBuilding.toStr());
			}
			
			else if(menuOption.equals("VC")) {
				System.out.println("\t-- Contractor Details --\n");
				System.out.println(newPerson.toStr());
			}
			
			else if (menuOption.equals("E")) {
				System.out.println("Program Exited");
				break;
				//chosen = true;
			}
		}
		
		// Project and contractor details are displayed in a meaningful manner		

		//System.out.println("\n");

		userInput.close();
	}

}
