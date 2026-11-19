package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.lang.InterruptedException;


public class TypesOfSelectors
{
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver=new ChromeDriver();
            driver.get("https://maya.adityauniversity.in");
            Thread.sleep(3000);
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//a[.='Login']")).click();
            Thread.sleep(5000);
            driver.findElement(By.name("roll_no")).sendKeys("23A91A4418");
            Thread.sleep(3000);
            driver.findElement(By.name("password")).sendKeys("123456");
            driver.findElement(By.className("password-show")).click();
            driver.findElement(By.cssSelector("button[type='submit']")).click();
        System.out.println("Clicked Sign in button successfully");
    }
}
