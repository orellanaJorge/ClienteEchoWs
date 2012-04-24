package test;

import java.rmi.RemoteException;
import cl.aycregimen.inp.pym.AyCRegimenStub;

public class Fainal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AyCRegimenStub customer = null;
		AyCRegimenStub.Proc_elegibilidad_sps request = null;
		AyCRegimenStub.Proc_elegibilidad_spsResponse response = null;

		try {

			// creamos el soporte y la peticion
			customer = new AyCRegimenStub();
			request = new AyCRegimenStub.Proc_elegibilidad_sps();

			// establecemos el parametro de la invocacion
			request.setRun(6616066);
			request.setFecha_Consulta(20120316);
			request.setC_Usuario(1);
			request.setPuntaje(0);
			request.setPuntaje_fps(0);
			
			// invocamos al web service
			response = customer.proc_elegibilidad_sps(request);		
			
			// mostramos la respuesta
			System.out.println("Nombres  : " + response.getNombres());
			System.out.println("Apellido MAterno : " + response.getApellido_Materno());
			System.out.println("Apellido Paterno : " + response.getApellido_Paterno());
			System.out.println("Sexo : " + response.getSexo());			
			
			System.out.println("Fecha Defuncion: " + response.getFecha_Defuncion());
			
			
			
			
			
		} catch (RemoteException excepcionDeInvocacion) {
			System.err.println(excepcionDeInvocacion.toString());
		}

}
}
