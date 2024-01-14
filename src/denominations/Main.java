package denominations;

public class Main {

	public static void main(String[] args) {
		
		DenominationCalculator calculator
			= new DenominationCalculator();
		
		calculator.collectDenominations();
		calculator.collectPaymentAmount();
		
		calculator.calculate();
	}
}