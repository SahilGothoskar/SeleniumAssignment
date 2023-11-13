package testPackage;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Test01 {
	
	public static WebDriver driver;
	private String testName = "Scenario 1";
	private int counter = 0;
    
	@BeforeTest
    public void setUp() {

		FirefoxOptions options = new FirefoxOptions();
		options.addPreference("browser.download.folderList", 2);
		options.addPreference("browser.download.dir", "/Users/xinyihu/Desktop/NEU/info6255/SeleniumProject/Downloads");
		options.addPreference("browser.download.useDownloadDir", true);
		options.addPreference("browser.download.viewableInternally.enabledTypes", "");
		options.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf;text/plain;application/text;text/xml;application/xml");
		options.addPreference("pdfjs.disabled", true);
		options.addPreference("security.fileuri.strict_origin_policy", false);
		
        System.setProperty("webdriver.gecko.driver", "/Users/xinyihu/Desktop/NEU/info6255/geckodriver");
        driver = new FirefoxDriver(options);
        driver.manage().window().maximize();
    }
	
	@Test(dataProvider="userData")
	public void portalLogin(String username, String domain, String password) throws InterruptedException, IOException {
		
        driver.get("https://me.northeastern.edu");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        
        // passing user-name
        WebElement usernameField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input")));
        usernameField.sendKeys(username + domain);
        
        TimeUnit.SECONDS.sleep(1);
        ScreenshotHelper.takeScreenshot(driver, testName, ++counter);
        
        WebElement nextButton = driver.findElement(By.id("idSIButton9"));
        nextButton.click();
        
        // passing password
        WebElement passwordField = wait.until(ExpectedConditions.elementToBeClickable(By.name("passwd")));
        passwordField.sendKeys(password);
        
        TimeUnit.SECONDS.sleep(1);
        ScreenshotHelper.takeScreenshot(driver, testName, ++counter);
        
        WebElement signInButton = driver.findElement(By.id("idSIButton9"));
        signInButton.click();
        
        // trust browser
        WebElement trustBrowserButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("trust-browser-button")));
        trustBrowserButton.click();
        
        wait.until(ExpectedConditions.urlToBe("https://login.microsoftonline.com/common/federation/OAuth2ClaimsProvider"));
        WebElement yesButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Yes']")));
        
        ScreenshotHelper.takeScreenshot(driver, testName, ++counter);
        
        yesButton.click();
    }
	
//	@Test(dataProvider="userData")
//    public void transcriptDownload(String username, String domain, String password) throws InterruptedException, IOException {
//        
//        driver.get("https://northeastern.sharepoint.com/sites/StudentHub");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        
//        WebElement resourcesTab = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Resources")));
//        ScreenshotHelper.takeScreenshot(driver, testName, ++counter);
//        resourcesTab.click();
//        
//        WebElement academicsLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Academics, Classes & Registration')]")));
//        ScreenshotHelper.takeScreenshot(driver, testName, ++counter);
//        academicsLink.click();
//
//        WebElement myTranscriptsLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("My Transcript")));
//        ScreenshotHelper.takeScreenshot(driver, testName, ++counter);
//        myTranscriptsLink.click();
//        
//        for(String winHandle : driver.getWindowHandles()){
//            driver.switchTo().window(winHandle);
//        }
//        
//        TimeUnit.SECONDS.sleep(3);
//        
//        // passing user-name
//        WebElement usernameField = wait.until(ExpectedConditions.elementToBeClickable(By.id("username")));
//	    usernameField.sendKeys(username);
//	    ScreenshotHelper.takeScreenshot(driver, testName, ++counter);
//	
//	    //passing password
//	    WebElement passwordField = wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
//	    passwordField.sendKeys(password);
//	    ScreenshotHelper.takeScreenshot(driver, testName, ++counter);
//	    
//        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("_eventId_proceed")));
//        loginButton.click();
//        
//        driver.switchTo().frame("duo_iframe");
//        WebElement sendPushButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Send Me a Push')]")));
//        ScreenshotHelper.takeScreenshot(driver, testName, ++counter);
//        sendPushButton.click();
//        driver.switchTo().defaultContent();
//        
//        // select transcript type
//        WebElement transcriptLevelDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@name='levl']")));
//        Select transcriptLevelSelect = new Select(transcriptLevelDropdown);
//        transcriptLevelSelect.selectByVisibleText("Graduate");
//        
//        WebElement transcriptTypeDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@name='tprt']")));
//        Select transcriptTypeSelect = new Select(transcriptTypeDropdown);
//        transcriptTypeSelect.selectByVisibleText("Audit Transcript");
//        
//        ScreenshotHelper.takeScreenshot(driver, testName, ++counter);
//        
//        WebElement submitButton = driver.findElement(By.xpath("//input[@value='Submit']"));
//        submitButton.click();
//    }
	
	@DataProvider(name = "userData")
	public String[][] userData() throws IOException {
		String[][] data = ReadCSVHelper.readDataFromCSV("/Users/xinyihu/Desktop/NEU/info6255/SeleniumProject/login_credentials.csv");
		return data;
	}
	
	@AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
        
}
