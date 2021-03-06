package net.authorize.data.xml;

import javax.xml.bind.annotation.XmlRootElement;

import net.authorize.data.echeck.ECheck;

@XmlRootElement
public class BankAccount extends ECheck {

	private static final long serialVersionUID = 1L;

	protected BankAccount() { }

	public static BankAccount createBankAccount() {
		return new BankAccount();
	}

}
