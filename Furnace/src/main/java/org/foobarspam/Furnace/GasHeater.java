package org.foobarspam.Furnace;

public class GasHeater implements Heater {

	public double disengage(AmbientTemperature temperature) {
		double result = temperature.getTemperature() + 1;
		return result;
	}

	public double engage(AmbientTemperature temperature) {
		double result = temperature.getTemperature() - 1;
		return result;
	}

}
