package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatNewLeadsPage {
	
	@FindBy(xpath="//input[@name='fistname']")
	private WebElement fname;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement company;
	
	@FindBy(xpath="//input[@name='designation']")
	private WebElement title;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement phone;
	
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobile;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@name='noofemployees']")
	private WebElement noOfEmployees;
	
	@FindBy(xpath="//textarea[@name='lane']")
	private WebElement street;
	
	@FindBy(xpath="//input[@name='pobox']")
	private WebElement poBox;
	
	@FindBy(xpath="//input[@name='code']")
	private WebElement postalCode;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement city;
	
	@FindBy(xpath="//input[@name='country']")
	private WebElement country;
	
	@FindBy(xpath="//input[@name='state']")
	private WebElement state;
	
	@FindBy(xpath="//input[@title='save [Alt+s]'])[2]")
	private WebElement saveBtn;
	
	public CreatNewLeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLastName() {
		return lastname;
	}
	public WebElement getCompany() {
		return company;
	}
	public WebElement getTitle() {
		return title;
	}
	public WebElement getPhone() {
		return phone;
	}
	public WebElement getMobile() {
		return mobile;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getNoOfEmployees() {
		return noOfEmployees;
	}
	public WebElement getStreet() {
		return street;
	}
	public WebElement getPoBox() {
		return poBox;
	}
	public WebElement getPostalCode() {
		return postalCode;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getCountry() {
		return country;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	/**
	 * BL for TC 01
	 * @param fistname
	 * @param lName
	 * @param comp
	 */
	public void createLead(String fistname, String lName, String comp) {
		fname.sendKeys(fistname);
		lastname.sendKeys(lName);
		company.sendKeys(comp);
		saveBtn.click();
	}
	/**
	 * BL for TC 02
	 * @param fistname
	 * @param lName
	 * @param comp
	 * @param desg
	 * @param phn
	 * @param mob
	 * @param mailId
	 * @param noe
	 * @param strt
	 * @param pbox
	 * @param pcode
	 * @param cty
	 * @param st
	 * @param cntry
	 */
	public void createLead(String fistname, String lName, String comp, String desg, String phn, String mob, String mailId, 
			String noe, String strt, String pbox, String pcode, String cty, String st, String cntry) {
		fname.sendKeys(fistname);
		lastname.sendKeys(lName);
		company.sendKeys(comp);
		title.sendKeys(desg);
		phone.sendKeys(phn);
		mobile.sendKeys(mob);
		email.sendKeys(mailId);
		noOfEmployees.sendKeys(noe);
		street.sendKeys(strt);
		poBox.sendKeys(pbox);
		postalCode.sendKeys(pcode);
		city.sendKeys(cty);
		state.sendKeys(st);
		country.sendKeys(cntry);
		saveBtn.click();
	}
	/**
	 * BL for TC 03
	 * @param fistname
	 * @param lName
	 * @param comp
	 * @param desg
	 * @param phn
	 * @param mob
	 * @param mailId
	 * @param noe
	 */
	public void createLead(String fistname, String lName, String comp, String desg, String phn, String mob, String mailId, 
			String noe) {
		fname.sendKeys(fistname);
		lastname.sendKeys(lName);
		company.sendKeys(comp);
		title.sendKeys(desg);
		phone.sendKeys(phn);
		mobile.sendKeys(mob);
		email.sendKeys(mailId);
		noOfEmployees.sendKeys(noe);
		saveBtn.click();
	}
	/**
	 * BL for TC 04
	 * @param fistname
	 * @param lName
	 * @param comp
	 * @param strt
	 * @param pbox
	 * @param pcode
	 * @param cty
	 * @param st
	 * @param cntry
	 */
	public void createLead(String fistname, String lName, String comp, String strt, String pbox, String pcode,
			String cty, String st, String cntry) {
		fname.sendKeys(fistname);
		lastname.sendKeys(lName);
		company.sendKeys(comp);
		street.sendKeys(strt);
		poBox.sendKeys(pbox);
		postalCode.sendKeys(pcode);
		city.sendKeys(cty);
		state.sendKeys(st);
		country.sendKeys(cntry);
		saveBtn.click();
		
	}
	

}
