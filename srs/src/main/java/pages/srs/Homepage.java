package pages.srs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testbase.Base;

public class Homepage extends Base{

	public static WebElement branch(WebDriver driver)
	{
		return driver.findElement(getelement("branches"));
	}
	
	public static WebElement role(WebDriver driver)
	{
		return driver.findElement(getelement("roles"));
	}
	
	public static WebElement user(WebDriver driver)
	{
		return driver.findElement(getelement("users"));
	}
	
	public static WebElement employee(WebDriver driver)
	{
		return driver.findElement(getelement("employee"));
	}
}
