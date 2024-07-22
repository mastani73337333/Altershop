package altershop_page_object;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Altershop_creatorproflepage_AssertPageobject 
{
	WebDriver driver;
	public Altershop_creatorproflepage_AssertPageobject(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='absolute left-[3px] z-[0] h-[79.07%] w-[95.4%] bg-primary']")
	WebElement coonectelement;
	@FindBy(xpath="//body/div[@id='__next']/div[contains(@class,'bg-black')]/div[contains(@class,'bg-pattern min-h-[calc(100vh-7rem)] bg-opacity-40 bg-cover bg-fixed bg-no-repeat')]/div/div/div[contains(@class,'flex h-full items-center md:h-full')]/div[1]")
	WebElement googleconnect;
	@FindBy(xpath="//input[@type='email']")
		WebElement loginemail;
	@FindBy(xpath="//span[normalize-space()='Next']")
	WebElement nextbutton;
	@FindBy (xpath="//input[@type='password']")
	WebElement btn_password;
	public void connect()
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", coonectelement);

	}
	public void connectwithgoogle()
	{
		
			Set<String> windows = driver.getWindowHandles();

			List<String> windowids = new ArrayList(windows);

			System.out.println(windowids);

			String parentwindow = windowids.get(0);
			String childWindow = windowids.get(1);

			// switch to parent window

			driver.switchTo().window(childWindow);
			 googleconnect.click();

		
	}
	public void login() throws InterruptedException
	{
	
		Set<String> windows=driver.getWindowHandles();
		//to get IDs from set using Iterator
		Iterator<String> ids=windows.iterator();
		String parent=ids.next();
		String ch1=ids.next();
		String ch2=ids.next();
		System.out.println(parent);
		System.out.println(ch1);
		System.out.println(ch2);
		driver.switchTo().window(ch2);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		loginemail.sendKeys("shaikmastani7333@gmail.com");
		
	
	}
	public void next()
	{
		nextbutton.click();
	}
	public void password()
	{
		btn_password.sendKeys("Mastani@7333");
	}
	
	

}
