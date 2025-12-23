//package tests;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import base.BaseTest;
//import pages.HomePage;
//import pages.LoginPage;
//import utils.ConfigReader;
//
//
//	public class LoginTest extends BaseTest {
//
//		
//		
//	    @Test
//	    public void invalidLoginShouldShowError() {
//	    	
//	    
//	        System.out.println("Email from config: " + ConfigReader.get("invalidEmail"));
//	        System.out.println("Password from config: " + ConfigReader.get("invalidPassword"));
//
//	        HomePage home = new HomePage(driver);
//	        home.clickLoginIcon();
//
//	        LoginPage login = new LoginPage(driver);
//            login.login(
//             ConfigReader.get("invalidEmail"),
//              ConfigReader.get("invalidPassword")
//       );
////	        
//	   //    login.login("sdet2025@gmail.com", "sdet2025");
//	       login.signInBtn.click();
//
//	        Assert.assertTrue(login.isErrorDisplayed(),
//	                "Error message not displayed");
//	    }
//	}
//
//
//
