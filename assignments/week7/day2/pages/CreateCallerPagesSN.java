package assignments.week7.day2.pages;

import week7.day2.assignments.hooks.TestNgHooks;

public class CreateCallerPagesSN extends TestNgHooks {

	public CreateCallerPagesSN typeFirstname(String firstname) {

		clearAndType(locateElement("id", "sys_user.first_name"), firstname);
		return this;
	}

	public CreateCallerPagesSN typeLastname(String lastname) {
		clearAndType(locateElement("id", "sys_user.last_name"), lastname);
		return this;
	}

	public CreateCallerPagesSN typeUsertitle(String usertitle) {
		clearAndType(locateElement("id", "sys_user.title"), usertitle);
		return this;
	}

	public CreateCallerPagesSN typeEmail(String email) {
		clearAndType(locateElement("id", "sys_user.title"), email);
		return this;
	}

	public CreateCallerPagesSN typePhone(String phno) {
		clearAndType(locateElement("id", "sys_user.phone"), phno);
		return this;
	}

	public CreateCallerPagesSN typeMobile(String mobile) {
		clearAndType(locateElement("id", "sys_user.mobile_phone"), mobile);
		return this;
	}

	public ReturnPageSN clickSubmit() {
		click(locateElement("id", "sysverb_insert"));

		return new ReturnPageSN();
	}

}
