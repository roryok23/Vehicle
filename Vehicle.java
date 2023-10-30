package iact.day7.example2;

public class Vehicle {
	
	private String regNumber;
	private String make;
	private String model;
	
	public Vehicle(){
		
		
	}

	public Vehicle(String rn, String mk, String md){
		
		regNumber = rn;
		make = mk;
		model = md;
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String rn) {
		regNumber = rn;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String mk) {
		make = mk;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String m) {
		model = m;
	}
	
	public void displayInLine(){
		//	System.out.printf("%10s %-20s %-20s %6s %8s\n", "Student", "First Name", "Last Name", "Year", "Fees");
		//	System.out.println("----------------------------------------------------");
			System.out.printf("%14d %-20s %-20s", regNumber, make, model);
		}
	
	public String toString(){
		String s = String.format("%14s %-20s %-20s", regNumber, make, model);
			return s;
				
		
	}
}
