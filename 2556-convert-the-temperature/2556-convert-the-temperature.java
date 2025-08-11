class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 9.0 / 5.0 + 32.0;
        return new double[]{kelvin, fahrenheit};
    }
}