package TestScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.GoogleSearchpage;
import Objects.Stackoverflowpage;

import org.testng.annotations.AfterTest;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TestMethods_GoogleSearch {

	WebDriver driver;
	GoogleSearchpage objectRepo;
	@BeforeTest
	
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
	}
	
	@Test(priority =1)
	public void searchOperation() throws InterruptedException {
		GoogleSearchpage page = new GoogleSearchpage(driver);
		page.searchGoogle("stack overflow");
	}
	
	@Test(priority = 2)
	public void clickStackoverFlow() {
		objectRepo = new GoogleSearchpage(driver);
		objectRepo.verifystackoverFlow();
		
	}
	@Test(priority =3)
	public void verifyLogin() {
		Stackoverflowpage page = new Stackoverflowpage(driver);
		page.enterLoginPage();
		page.enterUsername();
		page.enterPassword();
		page.login();
	}
	
	@AfterTest
	public void aftertest() {
		driver.quit();
	}
	
}
