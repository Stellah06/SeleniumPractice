package week3.day7.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.time.Duration;
import java.util.List;

public class LeafgroundCheckboxes {
    public static void main(String[] args) {
        //initialize driver
        ChromeDriver driver = new ChromeDriver();

        // open browser and maximize
        driver.get("https://leafground.com/checkbox.xhtml");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//span[text()='Basic']/parent::div")).click();
        driver.findElement(By.xpath("//span[text()='Ajax']/parent::div")).click();
        String check = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
        if (check.equalsIgnoreCase("Checked")) {
            System.out.println("Verification message '" + check + "'");
        }
        driver.findElement(By.xpath("//label[text()='Java']")).click();
        driver.findElement(By.xpath("(//h5[text()='Tri State Checkbox']/following::div)[3]")).click();
        String state = driver.findElement(By.xpath("//p[text()='State = 1']")).getText();
        if(state.contains("1")){
            System.out.println(" State is correct "+state);
        }
        driver.findElement(By.xpath("//h5[text()='Toggle Switch']/following::div")).click();
       // boolean isEnabled = driver.findElement(By.xpath("(//h5[text()='Verify if check box is disabled']/following::div)[2]")).isEnabled();
        boolean isEnabled = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
        System.out.println(isEnabled);
        System.out.println(driver.findElement(By.xpath("//span[text()='Disabled']")).getText());
        driver.findElement(By.xpath("//h5[text()='Select Multiple']/following::ul")).click();
        driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
        driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
        driver.findElement(By.xpath("(//label[text()='Rome'])[2]")).click();
        driver.findElement(By.xpath("//h5[text()='Select Multiple']/following::ul")).click();

        //Close page
        //driver.close();
    }
}