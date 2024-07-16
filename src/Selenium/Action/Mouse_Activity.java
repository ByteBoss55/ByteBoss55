package Selenium.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class Mouse_Activity {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("webdriver.chromedriver.driver","G:/Software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:100");
        driver.manage().window().maximize();
        driver.findElement(By.name("user_name")).sendKeys("admin");
        driver.findElement(By.name("user_password")).sendKeys("admin");
        driver.findElement(By.name("Login")).click();
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.id("showSubMenu"))).perform();
        Thread.sleep(2000);
        act.click(driver.findElement(By.linkText("New Vendor"))).perform();
        driver.findElement(By.xpath("//*[text()=New Vendor]")).isDisplayed();
        act.moveToElement(driver.findElement(By.linkText("My Account"))).click().perform();
        act.moveToElement(driver.findElement(By.name("Customise"))).click().perform();
        act.scrollToElement(driver.findElement(By.linkText("Copyrights"))).perform();
        Thread.sleep(2000);
        act.scrollToElement(driver.findElement(By.linkText("My Account"))).click().perform();
    }
}
