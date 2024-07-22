package altershop_testcases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Altershop_Baseclass 
{
	public static WebDriver driver;
	public static Logger log;
	@BeforeClass
	public void openApp()
	{
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://betashop.alter.game/");
		log=Logger.getLogger(driver.getClass());
		PropertyConfigurator.configure("log4j.properties");
		log.info("altershop webpage is launched");
		
		

	}
	public String capturescreen(String name) throws IOException 
	{
		String timeStamp=new SimpleDateFormat("dd.MM.yyyy.hh.mm.ss").format(new Date());
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		//system.getProperty("user.dir")
		String target=(System.getProperty("user.dir")+"\\screenshots\\"+name+"_"+timeStamp+".png");
		
		try {
			FileUtils.copyFile(src, new File(target));
		}catch(Exception e) {
			e.printStackTrace();
		}
		log.info("screenshot is completed");
		return target;
		
	}

}
