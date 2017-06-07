package com.foobarspam.figuras;

public abstract class GeometricShape {
	
	//Propiedades (abstractas)
	protected String name = "";
	
	//Constructores
	public GeometricShape() {
		this.name = "Unknow";
	}
	
	public GeometricShape(String name) {
		this.name = name;
	}

	//Getters y setters
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//Lógica (abstracta)
	public abstract double area();
	
}
