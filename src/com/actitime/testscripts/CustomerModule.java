package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.acttime.generics.Baseclass;

public class CustomerModule extends Baseclass 
{
@Test(priority=1)
public void CreateCustomer()
{
 Reporter.log("CreateCustomer", true);	

}
@Test(priority=2)
public void ModifyCustomer()
{
Reporter.log("ModifyCustomer", true);	
}
@Test(priority=3)
public void DeleteCustomer()
{
Reporter.log("DeleteCustomer", true);	
}
}
