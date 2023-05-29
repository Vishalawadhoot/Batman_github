package Pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import Generic_classes.Base_page;

public class Pom1 extends Base_page
{
	@FindBy(xpath="//a[.='Create an Account']/../../../../../../header/div[1]/div[1]/ul/li[3]")
	private WebElement createacc;
	@FindBy(id="firstname")
	private WebElement firstname;
	@FindBy(id="lastname")
	private WebElement lastname;
	@FindBy(id="email_address")
	private WebElement emailid;
	@FindBy(id="password")
	private WebElement pwd;
	@FindBy(name="password_confirmation")
	private WebElement cnfpwd;
	@FindBy(xpath="//span[.='Create an Account']/../../../../../../../../../../../../body/div[1]/main/div[3]/div/form/div/div[1]/button/span")
	private WebElement submitbtn;
	
	public Pom1(WebDriver driver)
	{
		super(driver);
	}
	public void createaccount()
	{
		createacc.click();
	}
	public void enterfirstname(String fn)
	{
		firstname.sendKeys(fn);
	}
	public void enterlatstname(String ln)
	{
		lastname.sendKeys(ln);
	}
	public void enteremail(String eid)
	{
		emailid.sendKeys(eid);
	}
	public void enterpwd(String pd)
	{
		pwd.sendKeys(pd);
	}
	public void entercnfpwd(String cnfpd)
	{
		cnfpwd.sendKeys(cnfpd);
	}
	public void clickbtn()
	{
		submitbtn.click();
	}
	
}
