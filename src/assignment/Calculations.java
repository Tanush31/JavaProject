package assignment;

public class Calculations {
	static double premiumCalculationTerm(double sumassured){
		double premium=sumassured*0.001;
		return premium;
	}
	static double premiumCalculationHealth(double sumassured){
		double premium=sumassured*0.001*125;
		return premium;
	}
	
}
