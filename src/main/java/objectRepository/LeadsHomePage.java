package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsHomePage {
	
    @FindBy(xpath="//img[@title ='Creat Lead...']")
	private WebElement createNewButton;
	
    public LeadsHomePage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    public WebElement getCreateNewLeadButton() {
		return getCreateNewLeadButton();
    }
    
    /**
     * this is the business library to click on new btn
     */
    public void clickOnNewBtn() {
    	createNewButton.click();
    }
}
