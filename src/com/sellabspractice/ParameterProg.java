package com.sellabspractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterProg 
{
	@Parameters({"value1"})
	@Test
	public void ops(int a ) {
		
		System.out.println("value is: "+a);
	}

}
