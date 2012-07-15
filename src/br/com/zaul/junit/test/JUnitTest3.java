package br.com.zaul.junit.test;

import org.junit.Ignore;
import org.junit.Test;

public class JUnitTest3 {

	@Test
	@Ignore("Not ready to run")
	public void divisionWithException() {
		System.out.println("Method is not ready yet");
	}
}
