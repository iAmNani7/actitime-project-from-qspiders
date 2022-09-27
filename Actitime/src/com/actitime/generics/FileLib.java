package com.actitime.generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String getPropertyValue(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
	public String getExcelValue(String sheetname,int row,int cell) throws IOException
	{
		FileInputStream fis=new FileInputStream("./data/book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
}
