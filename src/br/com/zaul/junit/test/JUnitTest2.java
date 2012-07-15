package br.com.zaul.junit.test;

import org.junit.Test;

public class JUnitTest2 {

	@Test(expected = ArithmeticException.class)
	public void divisionByZeroWithException() {
		int i = 1/0;
	}
}
