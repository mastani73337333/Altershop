package altershop_page_object;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;

public class Altershop_SearchPageobject_Class
{
	WebDriver driver;
	public Altershop_SearchPageobject_Class(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='auto-suggestion-search']")
	WebElement searchfield;
	@FindBy(xpath="//img[@alt='search']")
	WebElement searchIcon;
	@FindBy(xpath="//div[@id='price-sort-select']")
	WebElement sortselect;
	@FindBy(xpath="//span[@class='MuiSlider-root MuiSlider-marked MuiSlider-colorPrimary MuiSlider-sizeMedium css-1tjjc6v']//span[8]")
	WebElement prizeRangeBefore;
	public void search()
	{
		searchfield.sendKeys("watch for test");
		Actions ac=new Actions(driver);
		 ac.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		 }
	public void prizerange()
	{
		 Actions ac=new Actions(driver);
		
		ac.dragAndDropBy(prizeRangeBefore, -50, 0).build().perform();

	}
    

		
	}
	

