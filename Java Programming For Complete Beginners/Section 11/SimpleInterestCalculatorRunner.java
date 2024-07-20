import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInterstCalculator calculator = new SimpleInterstCalculator("4500.00", "7.5");
		BigDecimal totalValue = calculator.calculateTotalValues(5);
		System.out.println(totalValue);

	}

}
