package thesecondtrial;
import java.util.Scanner;
public class tempconvertor {
	public static void main(String[] args) {
		// TEMPERATURE CONVERTOR
		// (condition) ? ReturnIfTrue : ReturenIfFalse;
		Scanner scanner = new Scanner(System.in);
		
		double inputVal;
		double convertedVal;
		String convertToUnit;
		
		// ask user to input a temperature value
		
		System.out.print("Enter the temperature: ");
		inputVal = scanner.nextDouble();
		
		// ask user to choose option 1 or 2
		
		// Option 1: Convert to Celsius

		// Option 2: Convert to Fahrenheit
		System.out.print("Do you wish to convert to Celsius or Fahrenheit? (C or F): ");
		convertToUnit = scanner.next();
		convertToUnit = convertToUnit.toUpperCase();
		
		convertedVal = (convertToUnit.equals("F")) ? (inputVal*9/5 + 32) : ((inputVal-32)*5/9); 
		
		// Print out the results with the appropriate unit
		
		System.out.printf("The converted temperature is %.1f degrees %s",convertedVal,convertToUnit);
		
		scanner.close();
		}

}
