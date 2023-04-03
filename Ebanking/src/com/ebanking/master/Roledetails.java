package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Roledetails 
{

	//EP
	
	@FindBy(xpath="//*[@id=\"btnRoles\"]")
	WebElement NewRole;

	@FindBy(xpath="/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")
	WebElement RHome;
	
	//EM
	
	public void Nrole()
	{
		NewRole.click();
	}
	
	public void Rhom() 
	{
	RHome.click();	
	}
}

