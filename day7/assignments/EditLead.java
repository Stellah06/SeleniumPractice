package week3.day7.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class EditLead {
    public static void main(String[] args) throws InterruptedException {
        //initialize driver
        ChromeDriver driver = new ChromeDriver();

        // open browser and maximize
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        Thread.sleep(2000);


        //Finding elements and click on login page
        WebElement user = driver.findElement(By.id("username"));
        user.sendKeys("demosalesmanager");

        WebElement pass = driver.findElement(By.name("PASSWORD"));
        pass.sendKeys("crmsfa");

        WebElement login = driver.findElement(By.className("decorativeSubmit"));
        login.click();

        //User click CRMSFA
        WebElement CRMSFA = driver.findElement(By.linkText("CRM/SFA"));
        CRMSFA.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Click Leads
        WebElement leads = driver.findElement(By.linkText("Leads"));
        leads.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.linkText("Create Lead")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Create leads
        driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("SAMS");
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Stellah");
        driver.findElement(By.xpath("//input[contains(@id,'lastName')]")).sendKeys("J");
        driver.findElement(By.xpath("//input[contains(@id,'lastNameLocal')]")).sendKeys("SMJ");
        driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("WMS-QA");
        driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Learn Selenium Automation");
        driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("smj@mail.com");
        WebElement selectElement = driver.findElement(By.xpath("//span[text()='State/Province']/following::select"));
        Select opr=new Select(selectElement);
        opr.selectByVisibleText("New York");
        driver.findElement(By.xpath("//input[@name='submitButton']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Edit Leads
        driver.findElement(By.xpath("//a[text()='Edit']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("");
        driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("This is important text");
        driver.findElement(By.xpath("//input[@value='Update']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //get title
        String title = driver.getTitle();
        System.out.println("Title of the new page:"+title);

        //close page
        //driver.close();
    }
}
