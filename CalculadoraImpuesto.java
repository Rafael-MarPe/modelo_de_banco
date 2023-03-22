
public class CalculadoraImpuesto {
	private double Total;
	
	public void Registra(Tributacion t) {
		double valorh = t.getValorImpuestohacienda();
		double valors =t.getValorImpuestoseguro();
		double valor=valorh+valors;
		this.Total+=valor;
	}
	
		public double getTotalimpuesto() {
			return Total;
		}
	
}
