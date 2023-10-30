package iact.day7.example2;

public class Van extends Vehicle{
	
	private String wheelbase;
	private boolean refrigerated;
	
	public Van(){
		
		super();
	}

	public Van(String rn, String mk, String md, String wb, boolean rf){
		
		super(rn, mk, md);
		wheelbase = wb;
		refrigerated = rf;
		
	}

	public String getWheelbase() {
		return wheelbase;
	}

	public void setWheelbase(String wb) {
		wheelbase = wb;
	}

	public boolean getRefrigerated() {
		return refrigerated;
	}
	
	public String isRefrigerated() {
		return (refrigerated? "Yes":"No");
	}

	public void setRefrigerated(boolean rf) {
		refrigerated = rf;
	}

	@Override
	public void displayInLine(){
		super.displayInLine();
		System.out.printf("%s %-20s %-20s\n",super.toString(), wheelbase, refrigerated);
	}
	
@Override
	
	public String toString(){
		
		String s = String.format("%s %-20s %-20s\n", super.toString(), wheelbase, isRefrigerated());
		return s;
	}
}
