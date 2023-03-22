
public class controlbonificacion {
	private double suma;
	public double registrobonif(funcionario persona) {
		this.suma= this.suma+persona.getbonificacion();
		return this.suma;
	}
	
	//getter
	public double getSuma() {
		return suma;
	}
	

}
