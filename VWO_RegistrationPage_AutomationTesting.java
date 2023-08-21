package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.chrome.ChromeDriver;

public class VWO_RegistrationPage_AutomationTesting {
public static void main(String[] args) throws Exception {
WebDriver	driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://app.vwo.com/#/login");
Thread.sleep(3000);
 WebElement webregistrationPage = driver.findElement(By.xpath("//a[text()=\"Start a free trial\"]"));
 webregistrationPage.click();
 
// @postive testing for registrationPage
 
 WebElement emailTextFieldForRegistrationPage = driver.findElement(By.xpath("(//input[@name=\"email\"])[1]"));
 emailTextFieldForRegistrationPage.sendKeys("Snehasishs9354@gmail.com");
 Thread.sleep(2000);
 WebElement buttonClickAction = driver.findElement(By.xpath("//button[text()=\"create a free trial account\"]"));
 buttonClickAction.click();
 Thread.sleep(2000);
 WebElement firstNameTextFields = driver.findElement(By.xpath("//input[@id=\"page-v1-fname\"]"));
 firstNameTextFields.sendKeys("Snehasish");
 Thread.sleep(2000);
 WebElement lastNameTextFields = driver.findElement(By.xpath("//input[@id=\"page-v1-lname\"]"));
 lastNameTextFields.sendKeys("Samal");
 Thread.sleep(2000);
 WebElement PhoneNumerTextFields = driver.findElement(By.xpath("//input[@id=\"page-v1-pnumber\"]"));
 PhoneNumerTextFields.sendKeys("9776918714");
 Thread.sleep(2000);
 WebElement PasswordTextField = driver.findElement(By.xpath("//input[@name=\"password\"]"));
 PasswordTextField.sendKeys("Sneha@1234");
 Thread.sleep(2000);
 WebElement createAccountButton = driver.findElement(By.xpath("//button[text()=\"create account\"]"));
 createAccountButton.click();
 Thread.sleep(2000);
 driver.navigate().back();
 
// @Negative Testing
 
 driver.switchTo().newWindow(WindowType.TAB);
 driver.get("https://app.vwo.com/#/login");
 Thread.sleep(3000);
 WebElement webregistrationPage1 = driver.findElement(By.xpath("//a[text()=\"Start a free trial\"]"));
 webregistrationPage1.click();
 WebElement emailTextFieldForRegistrationPage1 = driver.findElement(By.xpath("(//input[@name=\"email\"])[1]"));
 emailTextFieldForRegistrationPage1.sendKeys("1234@gmail.com");
 Thread.sleep(2000);
 WebElement buttonClickAction1 = driver.findElement(By.xpath("//button[text()=\"create a free trial account\"]"));
 buttonClickAction1.click();
 Thread.sleep(2000);
 WebElement firstNameTextFields1 = driver.findElement(By.xpath("//input[@id=\"page-v1-fname\"]"));
 firstNameTextFields1.sendKeys("Sn1234");
 Thread.sleep(2000);
 WebElement lastNameTextFields1 = driver.findElement(By.xpath("//input[@id=\"page-v1-lname\"]"));
 lastNameTextFields1.sendKeys("123");
 Thread.sleep(2000);
 WebElement PhoneNumerTextFields1 = driver.findElement(By.xpath("//input[@id=\"page-v1-pnumber\"]"));
 PhoneNumerTextFields1.sendKeys("977691");
 Thread.sleep(2000);
 WebElement PasswordTextField1 = driver.findElement(By.xpath("//input[@name=\"password\"]"));
 PasswordTextField1.sendKeys("Sf1234");
 Thread.sleep(2000);
 WebElement createAccountButton1 = driver.findElement(By.xpath("//button[text()=\"create account\"]"));
 createAccountButton1.click();
 Thread.sleep(2000);
 
// postive testing for login page
 
 driver.switchTo().newWindow(WindowType.TAB);
 driver.get("https://app.vwo.com/#/login");
 Thread.sleep(3000);
 WebElement LoginPageEmailTextField = driver.findElement(By.xpath("(//input[@name=\"username\"])[1]"));
 LoginPageEmailTextField.sendKeys("snehasishsamal123@gmail.com");
 Thread.sleep(2000);
 WebElement LoginPagePasswordTextField = driver.findElement(By.xpath("(//input[@name=\"password\"])[1]"));
 LoginPagePasswordTextField.sendKeys("Samal@1234");
 Thread.sleep(3000);
 driver.findElement(By.xpath("(//div[@class=\"checkbox-radio\"])[1]")).click();
 Thread.sleep(2000);
 WebElement SignInOption = driver.findElement(By.xpath("//button[@id=\"js-login-btn\"]"));
 SignInOption.click();
}
}

