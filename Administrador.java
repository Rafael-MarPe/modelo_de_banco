
public class Administrador extends funcionario implements Autenticable{

	private Utileriaautenticar util;
	
	public Administrador() {
		util= new Utileriaautenticar();
	}
	@Override
	public double getbonificacion() {
	return this.getSalario();
	}

	@Override
	public void setcontraseña(String claveref) {
		this.util.setContraseña(claveref);
		
	}

	@Override
	public boolean autenticar(String clave) {
	return this.util.autenticar(clave); 
}



}
