package TCRepositry;

import org.testng.annotations.Test;

import genenicUitility.BaseClass;
import genenicUitility.ExcelUtility;
import genenicUitility.javaUtility;
import objectRepository.CreatNewLeadsPage;
import objectRepository.HomePages;
import objectRepository.LeadsHomePage;

public class LE_01 extends BaseClass {
	@Test//(groups= {"smoke"})
	
	public void le01Case() throws Exception {
	javaUtility JUTIL = new javaUtility();
	int num = JUTIL.getRandomNumber(1000);
	ExcelUtility EUTIL =new ExcelUtility();
	String FIRSTNAME = EUTIL.readDataFormExcel("leads", 1, 1);
	String LASTTNAME = EUTIL.readDataFormExcel("leads", 1, 2);
	String COMPANY = EUTIL.readDataFormExcel("leads", 1, 3);
	HomePages hp = new HomePages(driver);
	hp.clickOnLeads();
	LeadsHomePage lp = new LeadsHomePage(driver);
	lp.clickOnNewBtn();
	CreatNewLeadsPage cn =new CreatNewLeadsPage(driver);
	cn.createLead(FIRSTNAME+num, LASTTNAME, COMPANY);
	Thread.sleep(4000);
	}
	

}
