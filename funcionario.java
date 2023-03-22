
public abstract class funcionario {
	private String name;
	private int DUI;
	private double salario;
	
	
	
	//constructor
	
	public funcionario() {
	
	}
		
	
	public abstract double getbonificacion();
	//getters and setters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDUI() {
		return DUI;
	}
	public void setDUI(int dUI) {
		DUI = dUI;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}


