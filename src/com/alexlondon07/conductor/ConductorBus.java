package com.alexlondon07.conductor;

import com.alexlondon07.vehiculo.Bus;

public class ConductorBus extends Conductor{
	
	public ConductorBus(String nombre, String tipoLicencia, Bus bus) {
		super(nombre, tipoLicencia);
		this.setBus(bus);
		// TODO Auto-generated constructor stub
	}

	private Bus bus;
	
	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	@Override
	public void mostrarVehiculo() {
		// TODO Auto-generated method stub
		super.mostrarVehiculo();
		System.out.println(getBus().getMarca());
	}
	
	
}
