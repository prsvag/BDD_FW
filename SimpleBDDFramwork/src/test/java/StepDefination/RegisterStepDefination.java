package StepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterStepDefination {
    WebDriver driver;


    @Given("^User able to open browser$")
    public void user_able_to_open_browser() {
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("^Enter Url$")
    public void enter_Url() {
        driver.get("https://demo.nopcommerce.com/");
    }

    @Then("^User click on register Link$")
    public void user_click_on_register_Link() {
        driver.findElement(By.className("ico-register")).click();
    }

    @Then("^User Select the gender$")
    public void user_Select_the_gender() {
        driver.findElement(By.xpath("//*[text()='Male']")).click();
    }

    @Then("^user Enter the Firstname, Lastname and email id$")
    public void user_Enter_the_Firstname_Lastname_and_email_id() {
        driver.findElement(By.id("FirstName")).sendKeys("paresh");
        driver.findElement(By.id("LastName")).sendKeys("Patel");
        driver.findElement(By.id("Email")).sendKeys("Patel@gmail.com");

    }

    @Then("^User enter the company Name, password and confirm password$")
    public void user_enter_the_company_Name_password_and_confirm_password() {
        driver.findElement(By.id("Company")).sendKeys("www.nopcomerrce.com");
        driver.findElement(By.id("Password")).sendKeys("123456789");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456789");

    }

    @Then("^User select the DOB$")
    public void user_select_the_DOB() {
        driver.findElement(By.xpath("//*[text()='3']")).click();
        driver.findElement(By.xpath("//*[text()='May']")).click();
        driver.findElement(By.xpath("//*[text()='1995']")).click();

    }

    @Then("^User click on register Button$")
    public void user_click_on_register_Button() throws InterruptedException {
        driver.findElement(By.id("register-button")).click();
        Thread.sleep(2000);
        driver.close();

    }






  /*  @Given("^User able to open browser$")
    public void user_able_to_open_browser()  {
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("^Enter Url$")
    public void enter_Url()  {
        driver.get("https://demo.nopcommerce.com/");
    }

    @Then("^User click on register Link$")
    public void user_click_on_register_Link()  {
        driver.findElement(By.className("ico-login")).click();
    }


*/

}
