//package pages;
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.testng.annotations.Test;
//import org.openqa.selenium.support.ui.WebDriverWait;

//public class LoginPage {
//
//	
//	    WebDriver driver;
//	    
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	    
//	    By email = By.cssSelector("input[placeholder='Email']");
//	    By password = By.cssSelector("input[placeholder='Password']");
//	   
//	    public WebElement signInBtn = wait.until(
//	        ExpectedConditions.elementToBeClickable(
//	            By.xpath("//button[contains(text(),'Sign in')]") ) );
//
//
//	  
//	    By errorToast = By.cssSelector(".Toastify__toast--error");
//
//	    public LoginPage(WebDriver driver) {
//	        this.driver = driver;
//	    }
//
//	    public void login(String user, String pass) {
//	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	      //  driver.findElement(email).sendKeys("sdet2025@gmail.com");
//	       // driver.findElement(password).sendKeys("sdet2025");
//		      driver.findElement(email).sendKeys("sdet2025@gmail.com");
//		       driver.findElement(password).sendKeys("sdet2025");
//
//	    	
//	    	
//	      //  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//	        WebElement signInBtn = wait.until(
//	            ExpectedConditions.elementToBeClickable(
//	                By.xpath("//button[contains(text(),'Sign in')]")
//	            )
//	        );
//
//	        signInBtn.click();
//
//	    }
//
//	    public boolean isErrorDisplayed() {
//	        return driver.findElement(errorToast).isDisplayed();
//	    }
//	}
//
//	
//
