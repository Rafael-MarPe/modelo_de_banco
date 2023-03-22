
public class TestSistema {
 public static void main(String[] args) {
	Autenticable g=new gerente();
	g.setcontraseña("123485"); //ACÁ DEFINO LA CLAVE QUE PASARÉ 
	
	Sistemainterno si=new Sistemainterno();
	si.autenticar(g);
	
	Autenticable ad1=new Administrador();
	ad1.setcontraseña("123485");
	
	Sistemainterno si2=new Sistemainterno();
	si2.autenticar(ad1);
	
	Autenticable cl1=new cliente();
	cl1.setcontraseña("123485");
	
	Sistemainterno si3 = new Sistemainterno();
	si3.autenticar(cl1);
}
}
