package week3.day7.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class RadioButton {
    public static void main(String[] args) {
        //initialize driver
        ChromeDriver driver = new ChromeDriver();

        // open browser and maximize
        driver.get("https://www.leafground.com/radio.xhtml");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//label[text()='Chrome']")).click();
        driver.findElement(By.xpath("//label[text()='Chennai']")).click();
        driver.findElement(By.xpath("//label[text()='Chennai']")).click();
        boolean selected = driver.findElement(By.xpath("//label[text()='Chennai']")).isSelected();
        System.out.println("The radio button is selected: "+selected);

        //default browser
        String defaultBrowser = driver.findElement(By.xpath("//h5[contains(text(),'Find the default')]/following::input[@checked='checked']/following::label")).getText();
        System.out.println("Default Browser: "+defaultBrowser);

        WebElement age = driver.findElement(By.xpath("//h5[contains(text(),'Select the age group')]/following::span"));
        boolean selectedAge = age.isSelected();
        System.out.println(selectedAge);
        if(!selectedAge){
            driver.findElement(By.xpath("//h5[contains(text(),'Select the age group')]/following::span")).click();
            System.out.println("Age clicked: "+ age.isSelected());
        }else
            System.out.println("Age already clicked");
    }
}
