
public class Testtributacion {
public static void main(String[] args) {
	cuentacorriente cc1=new cuentacorriente(111, 23);
	cc1.depositar(100);
	
	CalculadoraImpuesto calc1 = new CalculadoraImpuesto();
	
	calc1.Registra(cc1);
	System.out.println(calc1.getTotalimpuesto());
}
}
