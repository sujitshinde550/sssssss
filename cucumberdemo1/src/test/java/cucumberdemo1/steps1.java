package cucumberdemo1;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class steps1 {
WebDriver driver;

@Given("^Open CIIT Web site$")
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedrivers\\96\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://ciitinstitute.com/login");
	}
@When("^url is enter into browser$")
public void Whenmethod()
{
	System.out.println("When Browse is open with CIIT Institute site");
}
@Then("^CIIT Web site should open$")
public void Thenmethod()
{
System.out.println("then open site");	
}


}
