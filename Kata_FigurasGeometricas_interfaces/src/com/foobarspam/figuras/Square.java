package com.foobarspam.figuras;

public class Square  extends GeometricShape implements Drawable {
	
	//Propiedades
	private double side = 0.;
	
	//Constructores
	public Square() {
		super();
	}
	
	public Square(double side) {
		super();
		this.side = side;
	}
	
	public Square(String name, double side) {
		super(name);
		this.side = side;
	}
	
	//Setters y getters
	public void setSide(double side) {
		this.side = side;
	}
	
	public double getSide() {
		return this.side;
	}
	
	//Lógica
	
	@Override
	public double area() {
		double area = this.side*this.side;
		return area;
	}
	
	@Override	
	public void draw() {
		System.out.println(getName()+", which is a square, has been drawn.");
	}
	
	@Override
	public void applyTheme() {
		System.out.println("A super cool theme was applied to "+getName()+"which is a Square.");
	}
	
	
	
}