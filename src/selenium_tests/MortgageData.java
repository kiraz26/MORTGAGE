package selenium_tests;


public class MortgageData {

	double homeValue;
	double downPaymentAmount;
	public final double DOWNPAYMENT_PERCENTAGE = 20;
	public final String mortgageType = "30 years";

	double interestRate;
	double propertytax;
	double homeInsurance;
	double HOAfees;

	public MortgageData() {
		homeValue = generateHomeValue();
		downPaymentAmount = getDownPayment();
		interestRate = generateInterestRate();
		propertytax = generatePropertyTax();
		homeInsurance = generateHomeInsurance();
		HOAfees = generateHOAFees();
	}
	
	
	

	/**
	 * This method should generate random number between 150,000.00 and 400,000.00
	 * 
	 * @return homeValue amount
	 */
	public double generateHomeValue() {
		// TODO
		
		return homeValue;
	}

	/**
	 * down payment will always be based on the DOWNPAYMENT_PERCENTAGE of the home
	 * value
	 * 
	 * @return down payment amount
	 */
	public double getDownPayment() {
		// TODO
		downPaymentAmount = homeValue * DOWNPAYMENT_PERCENTAGE;
		return downPaymentAmount;
	}

	/**
	 * This method should generate random number between 2.45 and 5.78
	 * 
	 * @return interestRate amount
	 */
	public double generateInterestRate() {
		// TODO
		
		return interestRate;
	}

	/**
	 * This method should generate random number between 600 and 1899
	 * 
	 * @return homeInsurance amount
	 */
	public double generateHomeInsurance() {
		// TODO

		return homeInsurance;
	}

	/**
	 * This method should generate random number between 44 and 200
	 * 
	 * @return HOAFees amount
	 */
	public double generateHOAFees() {
		// TODO

		return HOAfees;
	}

	/**
	 * This method should generate random number between 1.00 and 2.00
	 * 
	 * @return propertyTax amount
	 */
	public double generatePropertyTax() {
		// TODO

		return propertytax;
	}

}
