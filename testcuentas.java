
public class testcuentas {
	public static void main(String[] args) {
		cuenta cc=new cuentacorriente(1, 2);
		cuenta ca= new cuentaahorro(2, 3);
		
		cc.depositar(1000);
		cc.transferir(500, ca);
		
		System.out.println(cc.getsaldo());
		System.out.println(ca.getsaldo());
	}
}
