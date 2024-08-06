package com.exceptions.java;

class Amount {
	private String currency;
	private int amount;

	public Amount(String currency, int amount) {
		this.currency = currency;
		this.amount = amount;
	}

	public void add(Amount that) throws Exception {
		if (!this.currency.equals(that.currency)) {
			// throw new RuntimeException("Currencies does not match"); // when we throw
			// runtime exception then we need not to put throws in method declaration
			// throw new Exception("Currencies does not match " + this.currency + " & " +
			// that.currency); // we need to put
			// throws in
			String msg = " Currencies DO NOt match Exception ";
			throw new CurrenciesDoNotMatchException(msg); // method
			// declaration
		}
		this.amount = this.amount + that.amount;
	}

	@Override
	public String toString() {
		return currency + " " + amount;
	}
}

class CurrenciesDoNotMatchException extends Exception {
	/// it extends exception class
	public CurrenciesDoNotMatchException(String msg) {
		super(msg);
	}
}

// how to throw exception in code

public class ThrowingExceptionRunner {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Amount amount1 = new Amount("INR", 100);
		Amount amount2 = new Amount("USD", 80);
//		try {
		amount1.add(amount2);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			System.out.println("Currencies does not match ");
//			e.printStackTrace();
//		}
		System.out.println(amount1);
	}

}
