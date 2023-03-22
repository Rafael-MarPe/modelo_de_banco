public abstract class cuenta
{
	private int nrocuenta;
	protected double saldo;
	private int agencia;
	private cliente titular = new cliente();
	
	//variable estática
	
	private static int total=0;
	
	public static int getTotal() {
		return cuenta.total;
	}
	
	//CONSTRUCTOR
	
	public cuenta(int agencia, int nrocuenta) {
		if (agencia<0 ) {
			System.out.println("no se pueden poner valores"
					+ " negativos, se define la agencia"
					+ " por defecto");
			this.agencia=1;
			
			
		}
		else {
			System.out.println("se ha asignado la agencia");
			this.agencia=agencia;
			
		}
		if (nrocuenta<0) {
			System.out.println("no se pueden poner valores"
					+ " negativos, se define el numero de cuenta"
					+ " por defecto");
			this.nrocuenta=100;
		}
		else {
			System.out.println("se ha asignado el numero de cuenta");
			this.nrocuenta=nrocuenta;
		}
		
		cuenta.total++;
	}
	
	////DEPOSITAR
	
	public abstract double depositar(double valor);
	
	///////RETIRAR
	
	public boolean retirar(double valor) {
		if (this.saldo >valor){
			this.saldo-=valor;
				return true;
					}
		else {
				return false;
		}
	}
	
	/////TRANSFERIR
		
	public boolean transferir(double valor ,cuenta destino) {
		
		if(this.saldo>valor) {
			this.retirar(valor);
			destino.depositar(valor);
			System.out.println("la transferencia fue exitosa");
			return true;
			
		}
		else {
			System.out.println("saldo insuficiente");
			return false;
		}
		
	}
	
	//////////ACCESOS GETTER Y SETTER
	public double getsaldo() {
		return saldo;
	}
	
	public void setsaldo(double saldo) {
		this.saldo=saldo;
	}

	
	public int getNrocuenta() {
	return nrocuenta;
	}


	public int getagencia() {
		return agencia;
	}

	
	public void setTitular(cliente titular) {
		this.titular = titular;
	}
	public cliente getTitular() {
		return titular;
	}
	}
	

		
	
	

