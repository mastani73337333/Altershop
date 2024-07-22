package altershop_testcases;

import org.testng.annotations.Test;

import altershop_page_object.Altershop_SearchPageobject_Class;

public class AlterShop_SearchFunctionality_testcase extends Altershop_Baseclass 
{
	@Test
	public void search() throws InterruptedException
	{
		Altershop_SearchPageobject_Class ap=new Altershop_SearchPageobject_Class(driver);
		ap.search();
		ap.prizerange();
		
	
		
	}

}
