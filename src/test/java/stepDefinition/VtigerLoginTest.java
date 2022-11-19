package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VtigerLoginTest {
	
	WebDriver driver=null;
	@Given("launch browser and enter url")
	public void launch_browser_and_enter_url() {
	    WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://localhost:8888/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("enter valid credential")
	public void enter_valid_credential() {
	    driver.findElement(By.name("user_name")).sendKeys("admin");
	    driver.findElement(By.name("user_password")).sendKeys("admin");
	}

	@And("click on login")
	public void click_on_login() {
	    driver.findElement(By.id("submitButton")).click();
	}

	@Then("Home page should display")
	public void home_page_should_display() {
	    driver.close();
	}
}
