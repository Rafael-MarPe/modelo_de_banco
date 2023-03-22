
public class cuentacorriente extends cuenta implements Tributacion{

	public cuentacorriente (int agencia, int nrocuenta){
		super(agencia, nrocuenta);
	
		
	}
	public double depositar(double valor) {
		return this.saldo += valor;
	}
	@Override
	public boolean retirar(double valor) {
		double comision=0.2;
		return super.retirar(valor+comision);
	}
	@Override
	public double getValorImpuestohacienda() {
		
		return super.saldo*0.01;
	}
	@Override
	public double getValorImpuestoseguro() {
		return this.saldo*0.05;
	}

}
