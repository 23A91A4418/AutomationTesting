package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class WebElementDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://maya.adityauniversity.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[.='Login']")).click();
        Thread.sleep(4000);
        WebElement rollNumber = driver.findElement(By.name("roll_no"));

        rollNumber.sendKeys("23A91A4418");

        System.out.println(rollNumber.getAttribute("value"));

        rollNumber.clear();
    }
}
