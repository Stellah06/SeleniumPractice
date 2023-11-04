package week2.day4.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class CreateAccount {
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
        WebElement CRMSFA = driver.findElement(By.linkText("CRM/SFA"));
        CRMSFA.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Click Accounts
        WebElement accounts = driver.findElement(By.linkText("Accounts"));
        accounts.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Click Create Accounts
        WebElement createAccounts = driver.findElement(By.linkText("Create Account"));
        createAccounts.click();

        //Enter details to create account
        WebElement accountName = driver.findElement(By.id("accountName"));
        accountName.sendKeys("Stellah12");

        WebElement description = driver.findElement(By.name("description"));
        description.sendKeys("Selenium Automation Tester");

        WebElement industryEnumId = driver.findElement(By.name("industryEnumId"));
        Select opr=new Select(industryEnumId);
        opr.selectByValue("IND_SOFTWARE");

        WebElement ownershipEnumId = driver.findElement(By.name("ownershipEnumId"));
        Select opr2=new Select(ownershipEnumId);
        opr2.selectByVisibleText("S-Corporation");

        WebElement dataSourceId = driver.findElement(By.id("dataSourceId"));
        Select opr3=new Select(dataSourceId);
        opr3.selectByValue("LEAD_EMPLOYEE");

        WebElement marketingCampaignId = driver.findElement(By.id("marketingCampaignId"));
        Select opr4=new Select(marketingCampaignId);
        opr4.selectByIndex(7);

        WebElement generalStateProvinceGeoId = driver.findElement(By.id("generalStateProvinceGeoId"));
        Select opr5=new Select(generalStateProvinceGeoId);
        opr5.selectByValue("TX");

//        generalStateProvinceGeoId.sendKeys(Keys.TAB);
//
//        WebElement generalPostalCodeExt = driver.findElement(By.id("generalPostalCodeExt"));
//        generalPostalCodeExt.sendKeys(Keys.TAB);

        //Click create Account
        WebElement clickSubmit = driver.findElement(By.className("smallSubmit"));
        clickSubmit.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement accName = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
        String accNameText = accName.getText();
        String[] accountNameCreated=accNameText.split(" ");
        if(accountNameCreated[0].equalsIgnoreCase("Stellah12")){
            System.out.println("Account name is correct");
        }else
            System.out.println("Account name is wrong");

        //Close the tab
        driver.close();
    }

}