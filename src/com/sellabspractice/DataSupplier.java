package com.sellabspractice;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataSupplier
{
	
	@DataProvider(name = "datasource-1")
	   public Object[][] fetchData() throws IOException, BiffException {
		        Workbook wb = Workbook.getWorkbook(new File(System.getProperty("user.dir") +"\\Book1.xls"));
				Sheet sh= wb.getSheet("Sheet1");
				int rows = sh.getRows();
				int columns = sh.getColumns();
				String data[][]= new String [rows][columns];
				for (int i = 0; i < rows; i++) {
					for (int j=0; j< columns; j++)
					{
						Cell c = sh.getCell(j, i); // enter into cell
						data [i][j]= c.getContents();
						System.out.print(data[i][j]+"\t");
						
				}
					System.out.println("\n");
				}
				return data;
		}

}



