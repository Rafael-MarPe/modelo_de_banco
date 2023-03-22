
public class cuentaahorro extends cuenta{
	
	public double depositar (double valor) {
		return this.saldo+=valor;
	}
	public cuentaahorro(int agencia, int nrocuenta) {
		super(agencia, nrocuenta);	
	}

}
