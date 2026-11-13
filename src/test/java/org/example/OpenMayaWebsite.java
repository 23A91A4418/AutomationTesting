package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenMayaWebsite {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://maya.adityauniversity.in");
        driver.manage().window().maximize();
        driver.quit();
    }
}
