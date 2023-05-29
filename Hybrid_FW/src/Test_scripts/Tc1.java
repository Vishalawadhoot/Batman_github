package Test_scripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_classes.Base_Test_BM_AM;
import Pom_scripts.Pom1;

public class Tc1 extends Base_Test_BM_AM
{
	@Test(dataProvider = "testdata")
	public static void test1(String d1, String d2, String d3, String d4, String d5)
	{
		Pom1 p = new Pom1(driver);
		p.createaccount();
		p.enterfirstname(d1);
		p.enterlatstname(d2);
		p.enteremail(d3);
		p.enterpwd(d4);
		p.entercnfpwd(d5);
		p.clickbtn();
	}
	
	@DataProvider(name = "testdata")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "vishal", "Awadhoot", "vishalawadhoot8778@gmail.com", "Vishal@8778", "Vishal@8778" }
	 };
	}
}
