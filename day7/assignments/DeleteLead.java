package week3.day7.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.time.Duration;

public class DeleteLead {
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

        driver.findElement(By.linkText("Find Leads")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//span[text()='Phone']")).click();
        driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("12345");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(2000);
        WebElement firstLeadID = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner')]/a"));
        String leadID=firstLeadID.getText();
        System.out.println("First lead ID "+leadID);
        firstLeadID.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //delete lead
        driver.findElement(By.xpath("//a[text()='Delete']")).click();

        //find leads
        driver.findElement(By.linkText("Find Leads")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input")).sendKeys(leadID);
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

        //Verify lead deletion
        String text = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
        if(text.contains("No records")){
            System.out.println("Lead deleted");
        }else
            System.out.println("Deletion incorrect");


        //close page
        driver.close();
    }
}