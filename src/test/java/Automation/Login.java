package Automation;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	
	public WebDriver driver;

    @Given("^Initialize the browser and navigate to (.+)$")
    public void initialize_the_browser_and_navigate_to(String url) {
		System.setProperty("webdriver.gecko.driver", "C:\\RFTWorkspace\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		System.out.println("Starting Firefox and navigating to the login page.");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
    }

    @When("^User enters Username an Password and logs in$")
    public void user_enters_username_an_password_and_logs_in() {
    	System.out.println("Perform Login");
//		driver.findElement(By.name("login")).sendKeys("mercury");
//		driver.findElement(By.name("password")).sendKeys("mercury");
//		driver.findElement(By.name("login")).click();
//   	driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
    }

    @Then("^Verify that user is successfully logged in$")
    public void verify_that_user_is_successfully_logged_in() {
    	System.out.println("Verification");
    	driver.close();
    }

}