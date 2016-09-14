package com.alexlondon07.vehiculo;

public class Vehiculo {
	
	//Atributos
	private String matricula;
	private String marca;
	private String modelo;
	private int anio;
	
	
	//Mi constructor de Vehiculo
	public Vehiculo(String matricula, String marca) {
		super();
		setMatricula(matricula);
		this.marca = marca;
	}
	
	public Vehiculo(String matricula, String marca, String modelo, int anio) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
	}



	//Get and Setter Matricula
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		if(matricula.length() == 6 ){
			this.matricula = matricula;
		}else{
			System.out.println("La matricula debe tener 6 caracteres");
		}
	}

	//Get and Setter Marca
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	//Get and Setter Módelo
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	//Get and Setter Año
	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	//Metodos
	//Lower Camel Case
	public void arrancar(){
		System.out.println("El vehiculo arrancó");
	}

	public void frenar(){
		System.out.println("El vehiculo se frenó");
	}
	
	public void reverza(){
		System.out.println("El vehiculo esta de reverza");
	}


}
