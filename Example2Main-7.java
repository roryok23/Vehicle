package iact.day7.example2;

//import iact.day7.example7.Undergrad;

public class Example2Main {

	public static void main(String[] args) {
		Motorbike m1 = new Motorbike("1234", "Honda", "Mt", true, true);
		Van v1 = new Van("1234", "Mercedes", "M1", "wheelbase", true);
		
		
		System.out.printf("%-15s %-20s %-20s %-10s %-10s\n", "Reg No", "Make", "Model", "Sidecar", "Visor");
		System.out.println(m1);
		System.out.printf("%-15s %-20s %-20s %-10s %-10s\n", "Reg No", "Make", "Model", "Wheelbase", "Refrigerated");
		System.out.println(v1);
	}

}
