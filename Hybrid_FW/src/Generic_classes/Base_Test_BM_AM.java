package Generic_classes;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test_BM_AM implements Framework_constant
{
	public static WebDriver driver;
	@BeforeMethod
	public static void openapp()
	{
		System.setProperty(chrome_key, chrome_value);
		driver = new ChromeDriver();
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@AfterMethod
	public static void closeapp(ITestResult res) throws IOException
	{
		if (ITestResult.FAILURE==res.getStatus()) {
			Generic_Script_SS.getphoto(driver);
		}
		//driver.close();
	}
}
