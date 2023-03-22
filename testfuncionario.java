
public class testfuncionario {

	public static void main(String[] args) {
		
		funcionario cuentaF1 =new contador();
		cuentaF1.setName("Diego");
		cuentaF1.setDUI(112342);
		cuentaF1.setSalario(600);
		System.out.println(cuentaF1.getName());		
		System.out.println(cuentaF1.getbonificacion());
		
		//GERENTE
		gerente cuentaG1 = new gerente();
		cuentaG1.setSalario(9000);
	    cuentaG1.setName("roberto");
	   	System.out.println(cuentaG1.getName());
		System.out.println(cuentaG1.getbonificacion());
		
		//contador
		contador cuentaC1=new contador();
		cuentaC1.setSalario(7000);
		cuentaC1.setName("Pedro");
		System.out.println(cuentaC1.getName());
				System.out.println(cuentaC1.getbonificacion());
		
		//suma de bonificaciones
		controlbonificacion registro = new controlbonificacion();
		registro.registrobonif(cuentaG1);
		registro.registrobonif(cuentaF1);
		registro.registrobonif(cuentaC1);
		System.out.println("el total de los gastos en bonificacion es "
				+ "de " + registro.getSuma());
	}
}
