package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
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
	public void setExcelValue(String sheetname,int row,int cell, String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./data/book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(data);
		FileOutputStream fos=new FileOutputStream("./data/book1.xlsx");
		wb.write(fos);
		wb.close();
	}
}
