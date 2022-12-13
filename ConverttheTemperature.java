class Solution {
	//Kelvin = Celsius + 273.15
	//Fahrenheit = Celsius * 1.80 + 32.00
    public double[] convertTemperature(double celsius) {
        double sol[] = new double[2];
        sol[0]=celsius+273.15;
        sol[1]=celsius*1.80+32.00;
        return sol;
    }
}
public class ConverttheTemperature {

}
