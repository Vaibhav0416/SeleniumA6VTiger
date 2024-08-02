package com.crm.FileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	
	public static ArrayList<String> readFromExcel() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Vaibhav\\eclipse-workspace\\com.crm.VTiger1\\src\\test\\resources\\OrganizationDetails.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		int row = sheet.getPhysicalNumberOfRows();
		ArrayList<String> arr = new ArrayList<String>();
		for (int i = 0; i < row; i++) {
			arr.add(sheet.getRow(i).getCell(0).toString());
		}
		return arr;
	}

}
