package genenicUitility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import objectRepository.HomePages;
import objectRepository.LonginPage;

public class BaseClass {
	protected static WebDriver driver =null;
	selinimeUtility SUTIL =null;
	javaUtility PUTIL  = new javaUtility();
	
	@BeforeSuite(alwaysRun=true)
	public void createConnection() {
		System.out.println("connection estable");
	}
	@BeforeClass(alwaysRun=true)
	public void lounchBrowser() {
		String URL = ("URL");
		SUTIL =new selinimeUtility();
		driver =new ChromeDriver();
		SUTIL.implicitWait(driver, 10);
		SUTIL.maximizeWindow(driver);
		driver.get(URL);
		System.out.println("lounching successfully!!");
	}
	@BeforeMethod(alwaysRun=true)
	public void loginApp() {
		
		String USERNAME = PUTIL.getDataFormProperties("username");
		String PASSWORD = PUTIL.getDataFormProperties("password");
		LonginPage lp = new LonginPage(driver);
		lp.loginOperation(USERNAME,PASSWORD);
		System.out.println("login successfull!!");
		
	}
	@AfterMethod(alwaysRun =true)
	public void logoutApp() throws Exception {
	  HomePages hp = new HomePages(driver);
	  hp.logoutOperation(driver);
	  System.out.println("logout successfully!!");
	}
	@AfterClass(alwaysRun =true)
	public void closeApp() {
		System.out.println("brouser closed successfully!!");
	}
	@AfterSuite(alwaysRun =true)
	public void closeConnection() {
		System.out.println("connection close successfully!!");
	}

}
