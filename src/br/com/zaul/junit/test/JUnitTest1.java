package br.com.zaul.junit.test;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitTest1 {

	private Collection collection;
	
	@BeforeClass
	public static void oneTimeSetUp() {
		System.out.println("Before Class\n");
	}
	
	@AfterClass
	public static void oneTimeTearDown() {
		System.out.println("After Class\n");
	}
	
	@Before
	public void setUp() {
		this.collection= new ArrayList();
		System.out.println("Before\n");
	}
	
	@After
	public void tearDown() {
		this.collection.clear();
		System.out.println("After\n");
	}
	
	@Test
	public void testEmptyCollection() {
		Assert.assertTrue(this.collection.isEmpty());
		System.out.println("Test Empty\n");
	}
	
	@Test
	public void testOneItemCollection() {
		this.collection.add("Item");
		Assert.assertEquals(this.collection.size(), 1);
		System.out.println("Test One Item\n");
	}
}
