package week2.day4.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Select_LeafTaps {
    public static void main(String[] args) throws InterruptedException {
        //initialize driver
        ChromeDriver driver = new ChromeDriver();

        // open browser and maximize
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        Thread.sleep(2000);


        //Finding elements and click on login page
        WebElement user = driver.findElement(By.id("username"));
        user.sendKeys("DemoCSR");

        WebElement pass = driver.findElement(By.name("PASSWORD"));
        pass.sendKeys("crmsfa");

        WebElement login = driver.findElement(By.className("decorativeSubmit"));
        login.click();

        //User click CRMSFA
        WebElement CRMSFA= driver.findElement(By.linkText("CRM/SFA"));
        CRMSFA.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Click Leads
        WebElement leads=driver.findElement(By.linkText("Leads"));
        leads.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Click Create Leads
        WebElement createLead=driver.findElement(By.linkText("Create Lead"));
        createLead.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Create leads by entering fields
        WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
        companyName.sendKeys("SAMS");

        WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
        firstName.sendKeys("Stellah");

        WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
        lastName.sendKeys("J");

        //select source
        WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
        Select opr=new Select(source);
        opr.selectByIndex(4);

        //Select marketing Campaign
        WebElement marketingCampaignId = driver.findElement(By.name("marketingCampaignId"));
        Select opr1=new Select(marketingCampaignId);
        opr1.selectByVisibleText("Automobile");

        //select Ownership
        WebElement ownershipEnumId = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
        Select opr2=new Select(ownershipEnumId);
        opr2.selectByValue("OWN_CCORP");

        //Click submit
        WebElement submitButton = driver.findElement(By.name("submitButton"));
        submitButton.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //get title
        System.out.println(driver.getTitle());

        //close page
        driver.close();

    }
}
