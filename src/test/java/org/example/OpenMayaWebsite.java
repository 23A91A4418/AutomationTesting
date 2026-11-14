package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.lang.InterruptedException;
import org.openqa.selenium.chrome.ChromeDriver;
import javax.lang.model.element.Name;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class OpenMayaWebsite {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://maya.adityauniversity.in");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[.='Login']")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("roll_no")).sendKeys("23A91A4418");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Prasu@123");
        driver.findElement(By.xpath("//button[.='Sign In']")).click();
        WebElement Name = driver.findElement(By.xpath("//h1"));
        System.out.println(Name.getText());
    }
}
