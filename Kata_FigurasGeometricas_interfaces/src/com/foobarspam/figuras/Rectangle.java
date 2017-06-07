package com.foobarspam.figuras;

public class Rectangle  extends GeometricShape implements Drawable {
	
	//Propiedades
	private double width = 0.;
	private double height = 0.;
	
	//Constructores
	public Rectangle() {
		super();
	}
	
	public Rectangle(double height, double width) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(String name, double width, double height) {
		super(name);
		this.width = width;
		this.height = height;
	}
	
	
	//Setters y getters
		public double getWidth(){
			return this.width;
		}
		

		public double getHeight(){
			return this.height;
		}
		
		
		public void setWidth(double width){
			this.width = width;
		}
		

		public void setHeight(double height){
			this.height = height;
		}
	
	//Lógica
	@Override
	public double area() {
		double area = this.width*this.height;
		return area;
	}
	
	@Override
	public void draw() {
		System.out.println(getName()+", which is a rectangle, has been drawn.");
	}
	
	@Override
	public void applyTheme() {
		System.out.println("A super cool theme was applied to "+getName()+"which is a Rectangle.");
	}
	
}