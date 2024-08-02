package com.crm.tiger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import com.crm.Baseclass.VtigerBaseClass;
import com.crm.FileUtility.ReadExcel;
import com.crm.POM.OrgIndustry;
import com.crm.POM.Organization;

public class OrganizationIndustry extends VtigerBaseClass {
	@Test
	public void enterData() throws EncryptedDocumentException, IOException {
		ArrayList<String> data=ReadExcel.readFromExcel();

		OrgIndustry o = new OrgIndustry(driver);
		o.organizations();
		o.plus();
		o.organizationName(data.get(0));
		o.industry(data.get(1));
		o.saveButton();

	}
}
