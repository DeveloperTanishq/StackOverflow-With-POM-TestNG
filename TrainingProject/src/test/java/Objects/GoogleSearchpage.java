package Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchpage {

	WebDriver driver;
	
	public GoogleSearchpage(WebDriver driver) {
		this.driver = driver;
	}

	By searchBox = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input");
	By searchBtn = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]");
	By stackOverflowLink = By.xpath("//a//h3[text()='Stack Overflow - Where Developers Learn, Share, & Build ...']");
	
	public void searchGoogle(String searchInput)  {
		
		try {
			driver.findElement(searchBox).sendKeys(searchInput);
			Thread.sleep(1000);
			driver.findElement(searchBtn).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			System.out.println("Exception Caught in google :" + e.getMessage());
		}
	}
	
	public void verifystackoverFlow() {
		try {
			driver.findElement(stackOverflowLink).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Exception Caught in facebook :" +e.getMessage());
		}
	}
}
