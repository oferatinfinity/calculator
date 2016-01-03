package com.ilad;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tests {
  Calculator calc = new Calculator();
	
  	/**
	 * test substract
	 */
	@Test(alwaysRun=true)
  public void subst () {
		Assert.assertEquals(calc.substract(5,3), 2); 		
  }
	/**
	 * test add
	 */
	@DataProvider(name = "foradd")
	public Object[][] createData1() {
		return new Object[][] {
		   { 5,8 },
		   { 6,8 },
		 };
		}
	
	@Test(alwaysRun=true, dataProvider = "foradd")
	public void ad (int i , int j){
		Reporter.log("something");
		Assert.assertEquals(calc.add(i,j), 13); 
	}
	/**
	 * test multiply
	 */
	@Test(alwaysRun=true)
	public void mul(){
		Assert.assertEquals(calc.multiply(5,3), 15); 
	}
	/**
	 * test divide
	 */
	@Test(alwaysRun=true)
	public void div(){
		Assert.assertEquals(calc.divide(6,3), 2); 
	}
}
