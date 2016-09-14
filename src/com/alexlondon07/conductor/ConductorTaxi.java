package com.alexlondon07.conductor;

import com.alexlondon07.vehiculo.Taxi;

public class ConductorTaxi extends Conductor{

	public ConductorTaxi(String nombre, String tipoLicencia, Taxi taxi) {
		super(nombre, tipoLicencia);
		this.setTaxi(taxi);
		// TODO Auto-generated constructor stub
	}
	
	private Taxi taxi;
	
	public Taxi getTaxi() {
		return taxi;
	}

	public void setTaxi(Taxi taxi) {
		this.taxi = taxi;
	}

	@Override
	public void mostrarVehiculo() {
		// TODO Auto-generated method stub
		super.mostrarVehiculo();
		System.out.println(getTaxi().getMatricula());
	}

}
