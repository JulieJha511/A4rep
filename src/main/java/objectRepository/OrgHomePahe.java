package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgHomePahe {
	
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement newOrgBtn;
	
	public OrgHomePahe(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getNewOrgBtn() {
		return newOrgBtn;
	}
	/**
	 * business lib to click on new org btn
	 */
	public  void clickOrgBtn() {
		newOrgBtn.click();
	}

}
