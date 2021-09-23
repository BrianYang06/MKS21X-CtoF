// The parameters of the method should be double values and be celsius or Fahrenheit
//The functions should return Farenheit and or Celsius

public class CtoFTester{
  public static void main(String args[]){
    CelsiustoFahrenheit(1);
    FahrenheittoCelsius(1);
    System.out.print("It is ");
    System.out.print(CelsiustoFahrenheit(1));
    System.out.println("Fahrenheit");
    System.out.print("It is ");
    System.out.print(FahrenheittoCelsius(1));
    System.out.println("Celsius");
  }
  public static double CelsiustoFahrenheit(double c){
    double FfromC = (c * (1.8)) + 32;
    return FfromC;
  }
  public static double FahrenheittoCelsius(double f){
    double CfromF = (f - 32) * (1.8);
    return CfromF;
  }
}
