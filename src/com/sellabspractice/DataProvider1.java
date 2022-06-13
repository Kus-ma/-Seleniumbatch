package com.sellabspractice;

import org.testng.annotations.Test;

public class DataProvider1 
{
	
	// To specify where our Data provider Class is present we use Data Provider Class Parameter 
	 
	  @Test(dataProvider = "datasource-1", dataProviderClass = DataSupplier.class) 
	  
		//Here Data Supplier is another class where Data Provider is Present and providing class instances so control goes to DataSupplier
		  // class and identify the datasources-1 data provider and execute the code.
	  
	        public void execution(String a, String b, String c) {
			int val1 = Integer.parseInt(a);
			int val2 = Integer.parseInt(b);
			int val3= Integer.parseInt(c);
			System.out.println(val1 + val2 + val3);
		}
		

	}


