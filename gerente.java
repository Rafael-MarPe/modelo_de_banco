
public class gerente extends funcionario implements Autenticable{

	private Utileriaautenticar util;
	
	public gerente () {
		util = new Utileriaautenticar();
	}
@Override
public double getbonificacion() {
	return super.getSalario()*0.05 + super.getSalario();
}

@Override
//ESTO SE LEE ASI: SETEO LA CONTRA QUE SEA IGUAL A LA CLAVE QUE PASO EN EL TEST

public void setcontraseña(String claveref) {    //ACÁ YO SETEO UNA CONTRASEÑA, PERO ES DIFERENTE
	//A LA CONTRASEÑA QUE DEFINO SERÁ LA DE ACCESO, ESTA ES SOLO PARA QUE THIS.CONTRA SEA 
	//COMPARADA DESPUÉS CON LA CLAVE DE ACCESO
	this.util.setContraseña(claveref);
	
}

@Override
public boolean autenticar(String clave) {
	return this.util.autenticar(clave);
}




}
