package com.qa.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import com.qa.testBase.TestBase;

public class ExcelHandling extends TestBase
{
    @DataProvider(name="excel") 
	public  String[][] getData () 
	{
		String path="C:\\Users\\MANGESH PC\\OrangeHRM\\OrangeHRM\\OrangeHRM\\Excelsheet";
		try {
			FileInputStream fis= new FileInputStream(path);
			XSSFWorkbook wb= new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheet("sheetname");
			int rowcount= sheet.getPhysicalNumberOfRows();
			int cellcount= sheet.getRow(0).getLastCellNum();
			String data[][]=new String [rowcount-1][cellcount];
			for(int i=0;i<rowcount-1;i++)
			{
				for(int j=0;j<cellcount;j++)
				{
					DataFormatter df= new DataFormatter();
					data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
				}
			}
			
			wb.close();
			fis.close();
			return data;
			
		} 
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		

	}

}
