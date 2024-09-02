package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genenicUitility.selinimeUtility;

public class HomePages {
	
	@FindBy(xpath="//a[text()='Leads'])[1]")
    private WebElement leads;
	
	@FindBy(xpath="//a[text()='Organizations'])[2]")
    private WebElement org;
	
	@FindBy(xpath="//td[@class='small'])[2]")
    private WebElement preferences;
	
	@FindBy(xpath="//a[text()='Sign Out']")
    private WebElement signoutOption;
    
    public HomePages(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    public WebElement getLeads() {
    	return leads;
    }
    public WebElement getorg() {
    	return org;
    }
    public WebElement getpreferences() {
    	return  preferences;
    }
    public WebElement getsignoutOption() {
    	return  signoutOption;
    }
    /**
     * this is business lib to click on leads
     */
    public void  clickOnLeads() {
    	leads.click();
    }
    public void  clickOnOrg() {
    	org.click();
    }
    public void logoutOperation(WebDriver driver) throws Exception {
    	selinimeUtility SUTIL = new selinimeUtility();
    	SUTIL.moveCursonToAnElement(preferences);
    	Thread.sleep(3000);
    	SUTIL.moveCursonToAnElement(signoutOption);
    }
}
