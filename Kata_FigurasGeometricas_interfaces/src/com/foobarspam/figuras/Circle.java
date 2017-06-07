package com.foobarspam.figuras;

public class Circle extends GeometricShape implements Drawable {
	
	//Propiedades
	private double radius = 0.;
	private final double PI = Math.PI;
	
	//Constructores
	Circle() {
		super();
	}
	
	Circle(double radius) {
		super();
		this.radius = radius;
	}

	
	Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}
	
	
	//Getters y setters
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//Lógica
	@Override
	public double area() {
		double area = PI*this.radius*this.radius;
		return area;
	}
	
	@Override
	public void draw() {
		System.out.println(getName()+", which is a circle, has been drawn.");
	}
	
	@Override
	public void applyTheme() {
		System.out.println("A super cool theme was applied to "+getName()+"which is a Circle.");
	}

	
}
