public class cliente implements Autenticable{
	
	private String nombre;
	private String telefono;
	private String DUI;
	private Utileriaautenticar util;
	
	public cliente () {
		util= new Utileriaautenticar();
	}
	

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDUI() {
		return DUI;
	}
	
	public void setDUI(String DUI) {
		this.DUI=DUI;
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