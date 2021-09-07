package com.telecom.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.telecom.resources.CommonActions;

public class AddTariffPlanPage extends CommonActions {
	
	public AddTariffPlanPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Add Tariff Plan']")
	private WebElement addtariffbutton;
	
	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement rent;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement flm;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement fim;
	
	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement fsp;
	
	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement lmc;
	
	@FindBy(xpath = "(//input[@type='text'])[6]")
	private WebElement ipc;
	
	@FindBy(xpath = "(//input[@type='text'])[7]")
	private WebElement spc;
	
	@FindBy(name = "submit")
	private WebElement submit;

	public WebElement getAddtariffbutton() {
		return addtariffbutton;
	}

	public WebElement getRent() {
		return rent;
	}

	public WebElement getFlm() {
		return flm;
	}

	public WebElement getFim() {
		return fim;
	}

	public WebElement getFsp() {
		return fsp;
	}

	public WebElement getLmc() {
		return lmc;
	}

	public WebElement getIpc() {
		return ipc;
	}

	public WebElement getSpc() {
		return spc;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	

}
