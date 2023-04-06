import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;



public class HandlingDynamicDropdown {



public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "/Users/amare/Documents/chromedriver.exe");

WebDriver driver =new ChromeDriver();

driver.get("http://spicejet.com"); //URL of the browser

//  //a[@value='MAA']  - Xpath for chennai

//  //a[@value='BLR'] - Xpath of Bang

driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

driver.findElement(By.xpath("//a[@value='BLR']")).click();

Thread.sleep(2000);

//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

}



}