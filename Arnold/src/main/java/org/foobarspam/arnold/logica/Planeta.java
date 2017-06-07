package org.foobarspam.arnold.logica;

import java.util.EnumSet;

public enum Planeta {
	MERCURY(3.303e+23, 2.4397e6),
	VENUS(4.869e+24,6.0518e6),
	EARTH(5.976e+24,6.37814e6),
	MARS(6.421e+23, 3.3972e6),
	JUPITER(1.9e+27, 7.1492e7),
	SATURN(1.9e+27,6.0268e7),
	URANUS(8.686E+25, 2.5559E7),
	NEPTUNE(1.024E+26, 2.4746E7);
	
	private double radio;
	private double masa;
	private double G = 6.67300E-11;

	private Planeta(double masa,double radio) {
		this.radio=radio;
		this.masa = masa;
		
	}
	
	
	public double getRadio() {
		return this.radio;
	}
	
	public double getMasa() {
		return this.masa;
	}


	public double pesoSuperficie(double pesoHumano) {
		double earthGravitation = (G*EARTH.masa)/(EARTH.radio*EARTH.radio);
		double pesoSuperficie = (pesoHumano/earthGravitation)*(G*this.masa)/(this.radio*this.radio);
		return pesoSuperficie;
	}


	public static EnumSet<Planeta> getPlanetasTerrestres() {
		EnumSet<Planeta> planetasTerrestres = EnumSet.range(MERCURY, MARS);
		return planetasTerrestres;
	}


	public static EnumSet<Planeta> getGigantesGaseosos() {
		EnumSet<Planeta> planetasGaseosos = EnumSet.range(JUPITER,URANUS);
		return planetasGaseosos;
	}

}
