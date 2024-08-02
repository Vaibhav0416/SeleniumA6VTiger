package com.crm.tiger;

import java.io.IOException;

import org.testng.annotations.Test;

import com.crm.Baseclass.VtigerBaseClass;
import com.crm.POM.Organization;


public class CreateOrganization extends VtigerBaseClass {
@Test
public void main() throws InterruptedException, IOException
{
	Organization org = new Organization(driver);
	org.org();
	org.plusimg();
	Thread.sleep(2000);
	org.accname("OnePlus10Pro");
	Thread.sleep(2000);
	org.save_btn();
}
}
