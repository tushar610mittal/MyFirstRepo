package qa.crm.pages;

import qa.crm.base.TestBase;

public class HomePage extends TestBase {
	
	public String homepageURL() {
		return dr.getCurrentUrl();
	}

}
