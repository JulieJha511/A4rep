package genenicUitility;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class selinimeUtility {
	WebDriver driver = null;
	Actions act = null;
	Select s = null;
	/**
	 * this is genaric metho for implicit wait
	 * @param args
	 */

	public  void implicitWait(WebDriver driver,int particularSeconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(particularSeconds));
		
	}
	/**
	 * this is a genaric method to maximize window
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	/*----------------Action class generic function---------*/
	/**this is a generic method to click on an element
	 * 
	 */
	public void rightClickOnAnElement(WebDriver driver, WebElement element) {
		act = new Actions(driver);
		act.contextClick().perform();
		
	}
	/**
	 * this is a generic method to click on element
	 */
	public void ClickOnAnElement(WebDriver driver,WebElement element) {
		act = new Actions(driver);
		act.click(element).perform();
	}
	/**
	 * this is the generic metho to drag and drop element
	 */
	public void dragAndDropAnElement(WebDriver driver,WebElement src,WebElement target) {
		act = new Actions(driver);
		act.dragAndDrop(src, target).perform();
	}
	/**
	 * this is a generic method to drag and dropa pointer
	 */
	public void dragAPointer(WebElement src,int xOffset,int yOffset) {
		act = new Actions(driver);
		act.dragAndDropBy(src, xOffset, yOffset).perform();
	}
	/**
	 * this is a generic method to perform scroll down operation
	 */
	public void scrollToParticularElement(WebElement element) {
		act = new Actions(driver);
		act.scrollToElement(element).perform();
    }
	/**
	 * this is a generic method to move mouse cursor to a particular
	 */
	public void moveCursonToAnElement(WebElement element) {
		act = new Actions(driver);
		act.moveToElement(element);	
	}
	/**
	 * this is a generic method to hold an element
	 */
	public void holdAnElement(WebElement element) {
		act = new Actions(driver);
		act.clickAndHold(element).perform();
	}
	/**
	 * this is a generic method to release an element
	 */
	public void releaseAnElement(WebElement element) {
		act = new Actions(driver);
		act.release(element).perform();
	}
	
	/*--------------------select class generic function-----------*/
	/**
	 * this is a generic method to select an option based on index value
	 */
	public void selectElementByIndex(WebElement element, int indexNum) {
		s = new Select(element);
		s.selectByIndex(indexNum);
	}
	/**
	 * this is a generic method to select an option based on visible text
	 */
	public void selectElementByVisibleText(WebElement element, String text) {
		s = new Select(element);
		s.selectByVisibleText(text);
	}
	/**
	 * this is a generic method to select an option based on index value
	 */
	public void  selectElementByValue(WebElement  element, String value) {
		s = new Select(element);
		s.selectByValue(value);
	}
	/**
	 * this is a generic method to de select an option based on index value
	 */
	public void deSelectElementByIndex(WebElement element, int indexNum) {
		s = new Select(element);
		s.deselectByIndex(indexNum);
	}
	/**
	 * this is a generic method to de select an option base on visible text
	 */
	public void deSelectElementByVisibleText(WebElement element, String text) {
		s = new Select(element);
		s.deselectByVisibleText(text);
	}
	/**
	 * this is a generic method to de select an option base on value
	 */
	public void deSelectElementByValue(WebElement element, String value) {
		s = new Select(element);
		s.deselectByValue(value);
	}
	/**
	 * this is generic method to de select all the options
	 */
	public void deSelectAllOption(WebElement element) {
		s = new Select(element);
		s.deselectAll();
	}
	/**
	 * this method will help us to fetch all selected optein from a multi selection drop
	 */
	public List<WebElement> fetchAllSelectedOptions(WebElement element){
		s = new Select(element);
		List<WebElement> all = s.getAllSelectedOptions();
		return all;
		
	}
	/**
	 * this is the generic method to read all the  option
	 */
	public List<WebElement> fetchAllOptions(WebElement element){
		s = new Select(element);
		List<WebElement> all = s.getOptions();
		return all;	
	}
	/*---------------------alert ----------------*/
	/**
	 * this is a generic method to accept the alert
	 */
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	/**
	 * this is a generic method to dismiss the alert
	 */
	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}
	/*---------------------------frame----------------*/
	/**
	 * this is the generic method to switch frame based on child index
	 */
	public void switchTochildFrame(int childFrameindex) {
		driver.switchTo().frame(childFrameindex);
	}
}
