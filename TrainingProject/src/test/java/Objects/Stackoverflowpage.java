package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Stackoverflowpage {
WebDriver driver;
	
	public Stackoverflowpage(WebDriver driver) {
		this.driver = driver;
	}
	
	By loginPage = By.xpath("//a[text()='Log in']");
	By email = By.id("email");
	By password =By.name("password");

	public void enterLoginPage() {
		
		try {
			driver.findElement(loginPage).click();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Error at loginPage Btn: "+e.getMessage());
		}
	}
	public void enterUsername() {
		
		try {
			driver.findElement(email).sendKeys("csecec.1803217@gmail.com");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			System.out.println("Error at enterUsername: "+e.getMessage());
		}
	}
	public void enterPassword() {
		
		try {
			driver.findElement(password).sendKeys("Tanishq@05");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			System.out.println("Error at enterPassword : "+e.getMessage());
		}
	}
	public void login() {
		
		try {
			driver.findElement(By.cssSelector("button#submit-button")).click();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			System.out.println("Error at login Btn: "+e.getMessage());
		}
	}
}
