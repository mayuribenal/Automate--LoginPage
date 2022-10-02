// Java Program to Login to a specific Webpage
// Using Selenium WebDriver and ChromeDriver
  
// Importing package module to code fragment
package login_test;
  
// Importing required classes
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
  
// Main class
public class Test {
  
    // Main driver method
    public static void main(String[] args)
    {
  
        // Path of chrome driver
        // that will be local directory path passed
        System.setProperty(
            "webdriver.chrome.driver",
            "C:\\Users\\Mayuri\\Documents\\Phase5\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
  
        // URL of the login website that is tested
        driver.get("https://auth.geeksforgeeks.org/");
  
        // Maximize window size of browser
        driver.manage().window().maximize();
  
        // Enter your login email id
        driver.findElement(By.id("luser"))
            .sendKeys("xyz@gmail.com");
  
        // Enter your login password
        driver.findElement(By.id("password"))
            .sendKeys("xyz12345");
  
        driver.findElement(By.className("signin-button"))
            .click();
    }
}