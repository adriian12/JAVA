package org.foobarspam.Furnace;

public class App {


	
	public static void main(String[] args) {
		double minTemp = 15.0;
		double maxTemp = 23.0;
		
		AmbientTemperature temperature = new AmbientTemperature(17);
		Heater heater = new GasHeater();
		Regulator regulator = new Regulator();
		Thermometer t = new RemoteCommandSensor();
		System.out.println("Arrancando...");
		regulator.regulate(t, heater, minTemp, maxTemp, temperature);
	}
}
