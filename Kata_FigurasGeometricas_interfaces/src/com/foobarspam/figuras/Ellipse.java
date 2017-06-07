package com.foobarspam.figuras;

public class Ellipse  extends GeometricShape implements Drawable {
	
	//Propiedades
	private double a;
	private double b;
	private final double PI = Math.PI;

	
	//Constructores
	public Ellipse() {
		super();
	}
	
	public Ellipse(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Ellipse(String name, double a, double b) {
		super(name);
		this.a = a;
		this.b = b;
	}
	
	
	//Setters y getters
	public double getA(){
		return this.a;
	}
		

	public double getB(){
		return this.b;
	}
		
		
	public void setA(double a){
		this.a = a;
	}
		

	public void setB(double b){
		this.b = b;
	}
	
	//Lógica
	@Override
	public double area() {
		double area = getA()*getB()*PI;
		return area;
	}
	
	@Override
	public void draw() {
		System.out.println(getName()+", which is a ellipse, has been drawn.");
	}
	
}