package com.singworld.demo;

public class test {
	private double total = 0.0;

	public static void main(String[] args) {
		CashSuper csuper = CashFatory.createCashAccept("Âú300·µ100");
		double totalPrices = 0.0;
		totalPrices = csuper.acceptCash(500.0)*20;
		System.out.println(totalPrices);
		

	}

}
