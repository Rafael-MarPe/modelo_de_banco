
public class Sistemainterno {
	public String clave ="123485";
	public void autenticar(Autenticable p) {
		boolean exito = p.autenticar(this.clave);
		if (exito) {
			System.out.println("login exitoso");
		}
		else {
			System.out.println("no se puede iniciar sesion");
		}
	}
	
}


