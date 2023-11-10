package week3.day7.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class ImpDriverFunctionsLGButton {
    public static void main(String[] args) {
        //initialize driver
        ChromeDriver driver = new ChromeDriver();

        // open browser and maximize
        driver.get("https://leafground.com/button.xhtml");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //on Click
        driver.findElement(By.xpath("//span[text()='Click']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String title = driver.getTitle();
        if (title.equalsIgnoreCase("dashboard")) {
            System.out.println("The title is " + title);
        }
        driver.navigate().back();

        //check disabled
        boolean isEnabled = driver.findElement(By.xpath("//h5[contains(text(),'button is disabled')]/following-sibling::button")).isEnabled();
        //boolean isEnabled=driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
        System.out.println("Button enabled: " + isEnabled);

        //submit button
        Point location = driver.findElement(By.xpath("//span[text()='Submit']")).getLocation();
        System.out.println(location);

        //Colur of save button
        String color = driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("color");
        System.out.println("The color is "+color);
        //Button Color
        String background = driver.findElement(By.xpath("//span[text()='Save']/parent::button")).getCssValue("background");
        System.out.println("The background color is "+background);

        //Size
        Dimension size = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
        System.out.println("Size is "+size);

        //color change
        WebElement success = driver.findElement(By.xpath("(//span[text()='Success'])"));
        String colorBefore = success.getCssValue("background-color");
        System.out.println("Color before hover:"+ colorBefore);

        Actions builder=new Actions(driver);
        builder.moveToElement(success).perform();

        String colorAfter = success.getCssValue("background-color");
        System.out.println("Color before hover:"+ colorAfter);
        if(!colorAfter.equals(colorBefore)){
            System.out.println("Color changed");
        }

        //Click hidden button
        driver.findElement(By.xpath("//span[text()='Image']")).click();
        //driver.findElement(By.xpath("//span[text()='Primary']")).click();
        driver.findElement(By.xpath("//span[text()='Submit']")).click();

        //Rounded buttons
        List<WebElement> elementsRound = driver.findElements(By.xpath("//h5[contains(text(),'rounded buttons')]/following-sibling::button"));
        int noOfRoundedButtons = elementsRound.size();
        System.out.println("Number of rounded buttons: "+ noOfRoundedButtons);

    }
}