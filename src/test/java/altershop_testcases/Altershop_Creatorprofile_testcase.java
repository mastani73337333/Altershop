package altershop_testcases;

import org.testng.annotations.Test;

import altershop_page_object.Altershop_creatorproflepage_AssertPageobject;

public class Altershop_Creatorprofile_testcase extends Altershop_Baseclass
{
	@Test
	public void creator() throws InterruptedException
	{
		Altershop_creatorproflepage_AssertPageobject ac=new Altershop_creatorproflepage_AssertPageobject(driver);
		ac.connect();
		Thread.sleep(2000);
		ac.connectwithgoogle();
		ac.login();
		ac.next();
		ac.password();
		
	}
	

}
 