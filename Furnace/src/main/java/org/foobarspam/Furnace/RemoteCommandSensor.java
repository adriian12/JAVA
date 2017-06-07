package org.foobarspam.Furnace;

public class RemoteCommandSensor implements Thermometer {

	public double read(AmbientTemperature temperature) {
		double realTemperature = temperature.getTemperature();
		return realTemperature;
	}

}
