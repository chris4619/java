package com.base.math;

import java.math.BigDecimal;

public class TestBigdecimal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BigDecimal tax = new BigDecimal(100);
		System.out.println(tax.divide(new BigDecimal(3),2,BigDecimal.ROUND_HALF_DOWN));
	}

}
