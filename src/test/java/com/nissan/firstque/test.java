package com.nissan.firstque;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.nissan.firstque.firstque;

public class test {
	private firstque firstq ;
	
	@Before
	public void setup() {
		firstq = new firstque() ;
	}

	@Test
	public void addInteger() {
		Assert.assertEquals( "Pass", "60.0", firstq.function_name("10","50") ) ;
	}
	@Test
	public void addFloat() {
		Assert.assertEquals( "Pass", "32.1", firstq.function_name("10.9","21.2") ) ;
	}
	@Test
	public void addIntegrandFloat() {
		Assert.assertEquals( "Pass", "35.8", firstq.function_name("20","15.8") ) ;
	}
	
	@Test
	public void addNull() {
		Assert.assertEquals( "Fail", "Invalid Second number", firstq.function_name("1","") ) ;
	}
	
	@Test
	public void addaplhabet() {
		Assert.assertEquals( "Fail", "Invalid First number", firstq.function_name("A","2") ) ;
	}

}

