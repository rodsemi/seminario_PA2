
import java.util.Scanner;

/*
 * This program calculates a BMI Calculator
 * checks the users weight and displays it
 */

public class BMICalculator {
	
	// Scanner method
	Scanner w = new Scanner(System.in);
	
	// Variables
	private double weight, height, bmi;
	private int unitType;
	private String bmiCat;
	
	// Takes the users data
	public void readUserData() {
		this.readUnitType();
		this.readMeasurementData();
	}
	
	// Prints the an option to use the metric system 
	// or the imperial system for the user
	private int readUnitType() {
		System.out.print("Welcome! To use the metric system please eneter 1, "
				+ "for the imperial system please enter 2: ");
		this.unitType = w.nextInt();
		while(this.unitType != 1 && this.unitType != 2) {
			System.out.print("An invaild number was entered, please try again: ");
			this.unitType = w.nextInt();
		}
		
		return this.unitType;
		
	}
	
	// Checks the user input if 1 or 2
	private void readMeasurementData() {
		if(this.unitType == 1) {
			this.readMetricData();
		}else {
			this.readImperialData();
		}
	}
	
	// If the user chooses Metric prompt this on display 
	private void readMetricData() {
		System.out.print("Please provide your weight in kilograms: ");
		setWeight(w.nextDouble());
		System.out.print("\nPlease provide your height in meters: ");
		setHeight(w.nextDouble());
		
	}
	
	// If the user chooses Imperial prompt this on display 
	private void readImperialData() {
		System.out.print("Please provide your weight in pounds: ");
		setWeight(w.nextDouble());
		System.out.print("\nPlease provide your height in inches: ");
		setHeight(w.nextDouble());
		
	}
	
	// Calculates the users weight and height
	// This follows the guidelines on the rubric 
	public double calculateBmi() {
		if(this.unitType == 1) {
			this.bmi = this.weight/(this.height*this.height);
		}else {
			this.bmi = (703.0 * this.weight) / (this.height * this.height);
		}
		return unitType;
		
	}
	
	// Takes the user data and checks what body type
	// the user is and displays it to the screen 
	private String calculateBmiCategory() {
		if(this.bmi <= 18.5) {
			this.bmiCat = "Underweight";
		}
		else if (this.bmi < 25.0) {
			this.bmiCat = "Normal Weight";
		}
		else if (this.bmi < 30.0) {
			this.bmiCat = "Overweight";
		}else {
			this.bmiCat = "Obese";
		}
		return bmiCat;
	
	}
	
	// Tells the user what his BMI and body type
	public void displayBmi() {
		System.out.printf("\nYour BMI is currently %.1f, your weight is %s\n", this.getBmi(), this.calculateBmiCategory());
		System.out.printf("\nBMI Chart: Underweight (18.5 or less), %nNormal Weight (18.5-24.9), %nOverweight (25-29), "
				+ "%nObese (30+)");
		
	}
	
	// Returns weight
	public double getWeight() {
		return weight;
	}
	
	// Checks to see if user enters in a weight
	// if not the program closes 
	private void setWeight(double weight) {
		if(this.weight < 0.0) {
			System.out.println("Invalid weight! Program is closing!");
			System.exit(0);
		}else {
			this.weight = weight;
		}
		
	}
	
	// Returns height
	public double getHeight() {
		return height;
	}
	
	// Checks to see if user enters in a height
	// if not the program closes 
	private void setHeight(double height) {
		if(this.height < 0.0) {
			System.out.println("Invalid height! Program is closing!");
			System.exit(0);
		}else {
			this.height = height;
		}
			
	}
	
	// Returns bmi
	public double getBmi() {
		return bmi;
	}
	
	// Returns bmiCategory
	public String getBmiCategory() {
		return bmiCat;
	}

	// This was provided by the professor in the 
	// assignment page 
	public static void main(String[] args) {
		BMICalculator app = new BMICalculator();
	    app.readUserData();
	    app.calculateBmi();
	    app.displayBmi();
		
	}

}
