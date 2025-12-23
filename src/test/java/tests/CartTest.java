//package tests;
//import org.testng.annotations.Test;
//import org.testng.AssertJUnit;
//import org.testng.annotations.Test;
//import org.testng.AssertJUnit;
//import org.testng.annotations.Test;
//import org.testng.AssertJUnit;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import base.BaseTest;
//import pages.CollectionPage;
//
//public class CartTest {
//
//	
//	
//
//	
//	public class AddCartTest extends BaseTest {
//
//	    @Test
//	    public void userShouldAddProductToCart() {
//
//	        //  Open Collection page
//	        driver.get("https://craftyfy-frontend.vercel.app/collection");
//
//	        // Create CollectionPage object
//	        CollectionPage collection = new CollectionPage(driver);
//
//	        //  Steps
//	        collection.clickProduct();       // Click product image
//	        collection.selectRedColor();     // Select Red color
//	        collection.clickAddToCart();     // Add to cart
//
//	        // 🔹Validation
//	        AssertJUnit.assertEquals(
//	            collection.isCartCountVisible(),
//	            "Cart count not visible. Item not added."
//	        );
//	    }
//	}
//
//}
