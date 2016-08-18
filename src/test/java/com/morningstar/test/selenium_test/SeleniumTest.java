package com.morningstar.test.selenium_test;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

//import com.google.common.base.Function;

public class SeleniumTest {
	
	@Test()
	public void login(){
		System.out.println("hello world");
//		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://mercury-stg.morningstar.com");
//		
//		WebElement emailEl = waitForElementVisible(driver, By.cssSelector("input#email"), "Can't find email.");
//		emailEl.sendKeys("mercury.test1@morningstar.com");
//		WebElement passward = waitForElementVisible(driver, By.cssSelector("input#strPassword"), "Can't find passward.");
//		passward.sendKeys("Mstar123");
//		
//		WebElement loginBtn = waitForElementVisible(driver, By.cssSelector("#Login"), "Can't find login button.");
//		loginBtn.click();
//		
//		waitForElementVisible(driver, By.cssSelector("input#global-find-input"), "Can't find global find.");
//	
//		driver.quit();
	}

//	public static WebElement waitForElementVisible(WebDriver driver, final By locator, String errorMessage){
//		Function<WebDriver, WebElement> waitFn = new Function<WebDriver, WebElement>(){
//			@Override
//			public WebElement apply(WebDriver driver){
//				try{
//					WebElement el = driver.findElement(locator);
//					if(el.isDisplayed()){
//						return el;
//					}
//				}catch(Exception e){	
//				}
//				return null;
//			}
//		};
//		
//		WebDriverWait wait = new WebDriverWait(driver, 20, 500);
//		if(errorMessage != ""){
//			wait.withMessage(errorMessage);
//		}else{
//			wait.withMessage("Can't find webelement.");
//		}
//		
//		return wait.until(waitFn);
//	}
}
