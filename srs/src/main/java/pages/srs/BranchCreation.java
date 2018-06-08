package pages.srs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testbase.Base;

public class BranchCreation extends Base{

	public static WebElement newBranch(WebDriver driver)
	{
		return driver.findElement(getelement("newbranch"));
	}
	
}
