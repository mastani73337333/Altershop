package altershop_testcases;

import org.testng.annotations.Test;

import altershop_page_object.Altershop_Assertdetails_Pageobject_Class;


public class Altershop_assertdetails_testcase extends Altershop_Baseclass
{
	@Test
	public void details()
	{
		Altershop_Assertdetails_Pageobject_Class apc=new Altershop_Assertdetails_Pageobject_Class(driver);
		apc.categorydrop();
		apc.allcategoryoption();
		apc.alterBodyoption();
		apc.assertoption();
		
		
	
	
	}

}
