package Base_class;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Base_class {
	 static Logger logger= LogManager.getLogger(Base_class.class);
	 

																																																																																				/*
																																																																																				 * public static String url=
																																																																																				 * "https://www.amazon.in/ap/signin?clientContext=261-5470511-9360041&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fhz5%2Fyourmembershipsandsubscriptions%3Fref_%3Dnav_youraccount_digital_subscriptions%26_encoding%3DUTF8&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_swa_in&openid.mode=checkid_setup&marketPlaceId=A21TJRUUN4KGV&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=amazon&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.pape.max_auth_age=3600&siteState=clientContext%3D257-5091109-9056158%2CsourceUrl%3Dhttps%253A%252F%252Fwww.amazon.in%252Fhz5%252Fyourmembershipsandsubscriptions%253Fref_%253Dnav_youraccount_digital_subscriptions%2526_encoding%253DUTF8%2Csignature%3DUQNiFEKESMSu0ZI4FtUj2BA3gJ3CEj3D";
																																																																																				 * public static String username = "7385190460"; public static String password =
																																																																																				 * "1215000343";
																																																																																				 */
	@Test
	public static void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium practice\\seliniumdemo\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		logger.info("this is an error massage");
		logger.info("getting error");
		driver.get("https://www.amazon.in/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&switch_account=");
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("7385190460");
		
		driver.findElement(By.xpath("//input[@class=\"a-button-input\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("1215000343");

		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		
	}
}
	
/*
 * @AfterClass public void teardown() { driver.quit();
 * 
 * 
 * 
 * }
 */