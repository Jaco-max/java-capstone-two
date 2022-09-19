
public class Project {
	private String projectNumber;
	private String projectName;
	private String buildingType;
	private String projectAddress;
	private String projectERF;
	private String deadline;
	
	private double totalFee;
	private double totalPaid;
	private boolean finalised = false;
	
	
	//Create Project Object
	public Project(String projectNumber, String projectName, 
				   String buildingType, String projectAddress,
			       String projectERF, String deadline, 
			       double totalFee, double totalPaid, boolean finalised) {
		this.projectNumber = projectNumber;
		this.projectName = projectName;
		this.buildingType = buildingType;
		this.projectAddress = projectAddress;
		this.projectERF = projectERF;
		this.deadline = deadline;
		this.totalFee = totalFee;
		this.totalPaid = totalPaid;
		this.finalised = finalised;
	}
	
	public String getProjectNumber() {
		return projectNumber;
	}
		
	public String getProjectName() {
		return projectName;
	}	
	
	public void setProjectName(String newProjectName) {
		projectName = newProjectName;
	}
	
	public String getBuildingType() {
		return buildingType;
	}
	
	public String getProjectAddress() {
		return projectAddress;
	}
	
	public String getProjectERF() {
		return projectERF;
	}
	
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String newDeadline) {
		deadline = newDeadline;
	}
	
	public double getTotalFee() {
		return totalFee;
	}
	
	public double getTotalPaid() {
		return totalPaid;
	}
	
	public void setTotalPaid(double newTotalPaid) {
		totalPaid = newTotalPaid;
	}
	
	public boolean getFinalised() {
		return finalised;
	}
	
	public void setFinalised(boolean newFinalised) {
		finalised = newFinalised;
	}
	
	public String toStr() {
		String displayStr = "";
		displayStr = "Project Number: " + projectNumber + "\n"
				   + "Project Name: " + projectName + "\n"
				   + "Building type: " + buildingType + "\n"
				   + "Project Address: " + projectAddress +  "\n"
				   + "Project ERF Number : " + projectERF + "\n"
				   + "Project Deadline: " + deadline + "\n"
				   + "Total Fee: R" + totalFee + "\n"
				   + "Total paid to date: R" + totalPaid + "\n";
		return displayStr;
	}
}
