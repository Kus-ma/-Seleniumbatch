package com.sellabspractice;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataProvider 
{
	@Test(dataProvider = "dataprovider-1") //it will fisrt execute @Test Method and find Dataprovider is there so first data provider execute then test method
	public void execution(String a ,String b, String c)
	{
	int val1	= Integer.parseInt(a);
	int val2 =  Integer.parseInt(b);
	int val3= Integer.parseInt(c);
	System.out.println(val1 + val2 + val3);
		
}
	
	@org.testng.annotations.DataProvider (name = "dataprovider-1")
	public Object[][] fetchdata() throws IOException,BiffException {
		
	Workbook wb = Workbook.getWorkbook(new File(System.getProperty("user.dir") +"/Book1.xls"));
	Sheet sh= wb.getSheet("Sheet1");
	int rows = sh.getRows();
	int columns = sh.getColumns();
	String data[][]= new String [rows][columns];
	for (int i = 0; i < rows; i++) {
		for (int j=0; j< columns; j++)
		{
			Cell c = sh.getCell(j, i); // enter into cell
			data [i][j]= c.getContents();
			//System.out.print(data[i][j]+"\t");
			
	}
		System.out.println("\n");
	}
	return data;
	
}


}




