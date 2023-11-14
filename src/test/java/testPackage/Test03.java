package testPackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

@Epic("Suite")
@Feature("Class room Guide Download")
public class Test03 {
	
	private String testName = "Scenario 3";
	private int counter = 0;

	@Test
	@Story("Valid Login")
    @Description("Test the login functionality with valid credentials.")
	public void classroomGuide() throws InterruptedException {
		WebDriver driver = Test01.driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://service.northeastern.edu/tech?id=classrooms");
        
		TimeUnit.SECONDS.sleep(2);
		ScreenshotHelper.takeScreenshot(driver, testName, ++counter);
		
		// Select a classroom
		WebElement classroomLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'010 Behrakis Health Sciences Center')]")));
		classroomLink.click();
		
		TimeUnit.SECONDS.sleep(2);
		ScreenshotHelper.takeScreenshot(driver, testName, ++counter);
		
		// Click on Quick Guide PDF link
		WebElement guideLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='ng-binding']")));
		guideLink.click();
		
//		for(String winHandle : driver.getWindowHandles()){
//            driver.switchTo().window(winHandle);
//		}
//		
//		TimeUnit.SECONDS.sleep(2);
//		ScreenshotHelper.takeScreenshot(driver, testName, ++counter);
//		
//		// Click download
//		WebElement downloadButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='download']")));
//		downloadButton.click();
		
		TimeUnit.SECONDS.sleep(2);
        
	}
	
}
