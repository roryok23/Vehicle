
//package iact.day7.example2;

public class Motorbike extends Vehicle{
	
	private boolean sidecar;
	private boolean visor;
	
	public Motorbike(){
		
		super();
	}

	public Motorbike(String rn, String mk, String md, boolean sc, boolean v){
		
		super(rn, mk, md);
		sidecar = sc;
		visor = v;
		
	}

	public boolean getSidecar() {
		return sidecar;
	}
	
	public String isSidecar() {
		return (sidecar? "Yes":"No");
	}

	public void setSidecar(boolean sidecar) {
		sidecar = sidecar;
	}

	public boolean getVisor() {
		return visor;
	}
	
	public String isvisor() {
		return (visor? "Yes":"No");
	}

	public void setVisor(boolean visor) {
		visor = visor;
	}
	
	@Override
	public void displayInLine(){
		super.displayInLine();
		System.out.printf(" %-10s %-10\n", sidecar, visor);
	}
	
	@Override
	public String toString(){
		
		String s = String.format("%s %-10s %-10s\n", super.toString(), isSidecar(), isvisor());
		return s;
	}
}