package br.com.zaul.junit.test;

import org.junit.Test;


public class JUnitTest4 {

	@Test(timeout=1000)
	public void testTimeout(){
		while(true) {}
	}
}
