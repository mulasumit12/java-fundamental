import java.util.*;

public class CelsiusToFahrenheitConversion{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the celsius");
		double celsius=sc.nextDouble();
		double fahrenheit=(celsius * 9/5) + 32;
		System.out.print("Fahrenheit: "+fahrenheit);
	}
}
		