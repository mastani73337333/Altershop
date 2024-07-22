package altershop_page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Altershop_Assertdetails_Pageobject_Class 
{
	WebDriver driver;
	public Altershop_Assertdetails_Pageobject_Class(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Categories']")
	WebElement categories;
	@FindBy(xpath="//span[contains(@class,'font-SocialGothicMedium text-lg')][normalize-space()='All Categories']")
	WebElement allCategories;
	@FindBy(xpath="//img[contains(@alt,'avatar')]")
	WebElement alterBody;
	@FindBy(xpath="//body/div/div/div/div[@data-testid='dataSection']/div[@data-testid='assetCards']/div/div/div[14]/div[1]/div[1]/span[1]/img[1]")
	WebElement assertbody;
	@FindBy(xpath="//div[@class='flex h-full w-fit flex-row items-center justify-center bg-white/10 px-2 text-white hover:cursor-pointer hover:bg-blue-500']")
	WebElement react;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/span[3]/div[1]/*[name()='svg'][1]/*[name()='g'][1]/*[name()='g'][4]/*[name()='path'][1]")
	WebElement ok;
	
	
	public void categorydrop()
	{

		Actions ac=new Actions(driver);
		ac.moveToElement(categories).perform();
	
	}
	public void allcategoryoption()
	{
		allCategories.click();
	}
	public void alterBodyoption()
	{
		alterBody.click();
	}
	public void assertoption()
	{
		assertbody.click();
	}
	
}
