package TCRepositry;

import org.testng.annotations.Test;

import genenicUitility.BaseClass;
import genenicUitility.ExcelUtility;
import genenicUitility.javaUtility;
import objectRepository.CreatNewLeadsPage;
import objectRepository.HomePages;
import objectRepository.LeadsHomePage;

public class LE_03 extends BaseClass {
	@Test//(groups = {"sanity"})
	public void le01Case() throws Exception {
		
		
		javaUtility JUTIL = new javaUtility();
		int num = JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL =new ExcelUtility();
		String FIRSTNAME = EUTIL.readDataFormExcel("leads", 8, 1);
		String LASTTNAME = EUTIL.readDataFormExcel("leads", 8, 2);
		String COMPANY = EUTIL.readDataFormExcel("leads", 8, 3);
		String TITLE = EUTIL.readDataFormExcel("leads", 8, 4);
		String PHONE = EUTIL.readDataFormExcel("leads", 8, 5);
		String MOBILE = EUTIL.readDataFormExcel("leads", 8, 6);
		String EMAIL = EUTIL.readDataFormExcel("leads", 8, 7);
		String NOOFEMP = EUTIL.readDataFormExcel("leads", 8, 8);
		
		HomePages hp = new HomePages(driver);
		hp.clickOnLeads();
		LeadsHomePage lp = new LeadsHomePage(driver);
		lp.clickOnNewBtn();
		CreatNewLeadsPage cn =new CreatNewLeadsPage(driver);
        cn.createLead(FIRSTNAME, LASTTNAME, COMPANY, TITLE, PHONE, MOBILE, EMAIL, NOOFEMP);
		Thread.sleep(4000);
	}
}
