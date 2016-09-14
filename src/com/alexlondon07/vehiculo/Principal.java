package com.alexlondon07.vehiculo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creo un Objeto Vehiculo
		//Tipo de dato - nombreobjt
		Vehiculo veh = new Vehiculo("AS55", "BWM");
	
		
		//Metodos de tipo Vehiculo
		veh.arrancar();
		veh.frenar();
		veh.reverza();
		veh.arrancar();

		System.out.println(veh.getMatricula());
		
	}

}
