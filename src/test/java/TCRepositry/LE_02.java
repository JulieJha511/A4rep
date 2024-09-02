package TCRepositry;


import org.testng.annotations.Test;

import genenicUitility.BaseClass;
import genenicUitility.ExcelUtility;
import genenicUitility.javaUtility;
import objectRepository.CreatNewLeadsPage;
import objectRepository.HomePages;
import objectRepository.LeadsHomePage;

public class LE_02 extends BaseClass {
	
	@Test//(groups ={"regression"})
	public void le01Case() throws Exception  {
		javaUtility JUTIL = new javaUtility();
		int num = JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL =new ExcelUtility();
		String FIRSTNAME = EUTIL.readDataFormExcel("leads", 4, 1);
		String LASTTNAME = EUTIL.readDataFormExcel("leads", 4, 2);
		String COMPANY = EUTIL.readDataFormExcel("leads",4 ,3);
		String TITLE = EUTIL.readDataFormExcel("leads", 4, 4);
		String PHONE = EUTIL.readDataFormExcel("leads", 4, 5);
		String MOBILE = EUTIL.readDataFormExcel("leads", 4, 6);
		String EMAIL = EUTIL.readDataFormExcel("leads", 4, 7);
		String NOOFEMP = EUTIL.readDataFormExcel("leads",4, 8);
		String STREET = EUTIL.readDataFormExcel("leads", 4, 9);
		String POBOX = EUTIL.readDataFormExcel("leads", 4, 10);
		String POSTALCODE = EUTIL.readDataFormExcel("leads", 4, 11);
		String CITY = EUTIL.readDataFormExcel("leads", 4, 12);
		String COUNTRY = EUTIL.readDataFormExcel("leads", 4, 13);
		String STATE = EUTIL.readDataFormExcel("leads", 4, 14);
		HomePages hp = new HomePages(driver);
		hp.clickOnLeads();
		LeadsHomePage lp = new LeadsHomePage(driver);
		lp.clickOnNewBtn();
		CreatNewLeadsPage cn =new CreatNewLeadsPage(driver);
        cn.createLead(FIRSTNAME, LASTTNAME, COMPANY, TITLE, PHONE, MOBILE, EMAIL, NOOFEMP, STREET, POBOX,
		POSTALCODE, CITY, STATE, COUNTRY);
		Thread.sleep(4000);
		}
		
	

}
