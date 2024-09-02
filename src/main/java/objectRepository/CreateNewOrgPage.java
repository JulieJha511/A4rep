package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrgPage {
	
  @FindBy(xpath="//input[@name='accountname']")
  private WebElement orgName;
  
  @FindBy(xpath="//input[@name='webside']")
  private WebElement webSite;
  
  @FindBy(xpath="//input[@name='employees']")
  private WebElement employees;
  
  @FindBy(xpath="//input[@name='Phone']")
  private WebElement Phn;
  
  @FindBy(xpath="//input[@name='otherPhone']")
  private WebElement otherPhn;
  
  @FindBy(xpath="//input[@name='email']")
  private WebElement email;
  
  @FindBy(xpath="//input[@name='bill_street']")
  private WebElement billingAddress;
  
  
  @FindBy(xpath="//input[@name='bill_city']")
  private WebElement billingCity;
  
  @FindBy(xpath="//input[@name='bill_state']")
  private WebElement billingState;
  
  @FindBy(xpath="//input[@title='Save [Alt+S]'])(2)")
  private WebElement saveBtn;

  
  public CreateNewOrgPage(WebDriver driver) {
	  PageFactory.initElements(driver, this);
  }
  public WebElement getOrgName() {
	  return orgName;
  }
  public WebElement getWebSite() {
	  return webSite;
  }
  public WebElement getEmployees() {
	  return employees;
  }
  public WebElement getPhone() {
	  return Phn;
  }
  public WebElement getOtherPhn() {
	  return otherPhn;
  }
  public WebElement getEmail() {
	  return email;
  }
  public WebElement getBillingAddress() {
	  return billingAddress;
  }
  public WebElement getBillingCity() {
	  return billingCity;
  }
  public WebElement getBillingState() {
	  return billingState;
  }
  public WebElement getSaveBtn() {
	  return saveBtn;
  }
  public void creatOrganisation(String organisationName , String web , String emp) {
	  orgName.sendKeys(organisationName);
	  webSite.sendKeys(web);
	  employees.sendKeys(emp);
	  saveBtn.click();
  }
  public void creatOrganisation(String organisationName , String web , String emp ,String PhoneNumber , String otherPhone , String mailId) {
	  orgName.sendKeys(organisationName);
	  webSite.sendKeys(web);
	  employees.sendKeys(emp);
	  Phn.sendKeys(PhoneNumber);
	  otherPhn.sendKeys(otherPhone);
	  email.sendKeys(mailId);
	  saveBtn.click();
  }
  public void creatOrganisation(String organisationName , String web,  String billAd, String billCity, String billState) {
	  orgName.sendKeys(organisationName);
	  webSite.sendKeys(web);
	  billingAddress.sendKeys(billAd);
	  billingCity.sendKeys(billCity);
	  billingState.sendKeys(billState);
	  saveBtn.click();
  }
  public void creatOrganisation(String organisationName , String web , String emp ,String PhoneNumber ,
		  String otherPhone , String mailId ,String billAd , String billcity, String billState) {
	  orgName.sendKeys(organisationName);
	  webSite.sendKeys(web);
	  employees.sendKeys(emp);
	  Phn.sendKeys(PhoneNumber);
	  otherPhn.sendKeys(otherPhone);
	  email.sendKeys(mailId);
	  billingAddress.sendKeys(billAd);
	  billingCity.sendKeys(billcity);
	  billingState.sendKeys(billState);
	  saveBtn.click();
  }

}
