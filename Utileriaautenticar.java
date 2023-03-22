
public class Utileriaautenticar {
	private String Contraseña;
	
	public boolean autenticar(String clave) {
		return this.Contraseña ==clave;
	}
	
	public void setContraseña(String claveref) {
		this.Contraseña=claveref;
	}
}
