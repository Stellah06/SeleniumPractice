package week2.day4.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class CreateFBAccount {

    public static void main(String[] args) {
        //initialize driver
        ChromeDriver driver = new ChromeDriver();

        // open browser and maximize
        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Click create Account
        WebElement createNewAccount = driver.findElement(By.linkText("Create new account"));
        createNewAccount.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Enter details to create new account
        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("Elsa");

        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("Parker");

        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("ElssaaParker@gmail.com");

        WebElement password= driver.findElement(By.id("password_step_input"));
        password.sendKeys("myPassword");

        WebElement day = driver.findElement(By.id("day"));
        Select opr=new Select(day);
        opr.selectByValue("6");

        WebElement month = driver.findElement(By.id("month"));
        Select opr1=new Select(month);
        opr1.selectByIndex(11);

        WebElement year = driver.findElement(By.id("year"));
        Select opr2=new Select(year);
        opr2.selectByValue("2016");

        WebElement enterSex = driver.findElement(By.name("sex"));
        enterSex.click();

        WebElement websubmit = driver.findElement(By.name("websubmit"));
        websubmit.click();

        //Close page
        //driver.close();
    }
}