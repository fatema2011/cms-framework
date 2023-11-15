
package test;

import java.security.PublicKey;

import org.apache.commons.io.filefilter.TrueFileFilter;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseUtil.BaseClass;
import pages.HomePage;
public class HomePageTest extends BaseClass {

	@Test(enabled = false)
	public void clickcmsgovTest() throws InterruptedException {
		homePage.clickcmsgov();
		
	}
		@Test(enabled =true )
		public void medicare() throws InterruptedException {
			driver.findElement(By.xpath("(//span[@class=\"menu-item-element\"])[1]")).isDisplayed();
			driver.findElement(By.xpath("(//span[@class=\"menu-item-element\"])[1]")).click();
			Thread.sleep(3000);
			
		
			
		}

}
