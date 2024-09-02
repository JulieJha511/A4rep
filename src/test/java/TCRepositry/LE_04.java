package TCRepositry;

import org.testng.annotations.Test;

import genenicUitility.BaseClass;
import genenicUitility.ExcelUtility;
import genenicUitility.javaUtility;
import objectRepository.CreatNewLeadsPage;
import objectRepository.HomePages;
import objectRepository.LeadsHomePage;

public class LE_04 extends BaseClass{
	@Test//(groups = {"smoke,regression"})
	public void le01Case() throws Exception  {
		javaUtility JUTIL = new javaUtility();
		int num = JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL =new ExcelUtility();
		String FIRSTNAME = EUTIL.readDataFormExcel("leads", 12, 1);
		String LASTTNAME = EUTIL.readDataFormExcel("leads", 12, 2);
		String COMPANY = EUTIL.readDataFormExcel("leads", 12, 3);
		String STREET = EUTIL.readDataFormExcel("leads", 12, 4);
		String POBOX = EUTIL.readDataFormExcel("leads", 12, 5);
		String POSTALCODE = EUTIL.readDataFormExcel("leads", 12, 6);
		String CITY = EUTIL.readDataFormExcel("leads", 12, 7);
		String COUNTRY = EUTIL.readDataFormExcel("leads", 12, 8);
		String STATE = EUTIL.readDataFormExcel("leads", 12, 9);
		HomePages hp = new HomePages(driver);
		hp.clickOnLeads();
		LeadsHomePage lp = new LeadsHomePage(driver);
		lp.clickOnNewBtn();
		CreatNewLeadsPage cn =new CreatNewLeadsPage(driver);
        cn.createLead(FIRSTNAME, LASTTNAME, COMPANY, STREET, POBOX,
		POSTALCODE, CITY, STATE, COUNTRY);		
		Thread.sleep(4000);
		}

}
