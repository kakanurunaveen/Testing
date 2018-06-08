package pages.srs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testbase.Base;

public class NewBranch extends Base{

	public static WebElement branch(WebDriver driver)
	{
		return driver.findElement(getelement("branchname"));
	}
	
	public static WebElement address(WebDriver driver)
	{
		return driver.findElement(getelement("addres"));
	}
	
	public static WebElement zipcode(WebDriver driver)
	{
		return driver.findElement(getelement("zip"));
	}
	
	public static WebElement submitbtn(WebDriver driver)
	{
		return driver.findElement(getelement("submitbtn"));
	}
}
