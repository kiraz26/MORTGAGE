package selenium_tests;

import org.testng.annotations.Test;

public class MortgageDataTest {
	MortgageData mortgage = new MortgageData();
	MortgageDetails zillow = new MortgageDetails();
	MortgageDetails daveRamsey = new MortgageDetails();

	@Test
	public void test1() {
		// TODO test the zillow here
		zillow.monthlyHomeInsurance = mortgage.generateHomeInsurance()/12;
		zillow.monthlyPrincipalWithInterest = mortgage.generateInterestRate()/12;
		System.out.println(zillow.monthlyHomeInsurance);
	}

	@Test
	public void test2() {
		// TODO test the daveRamsey here
		//daveRamsey
	}

	@Test
	public void test3() {
		// TODO compare values here
	}
}
