package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exepom 
{
	
	 WebDriver driver;
	 
     @BeforeTest
	public void ALogin() throws InterruptedException 
	{
	     driver=new FirefoxDriver();
	     driver.manage().window().maximize();
	     driver.get("http://103.211.39.246/ranford2/");
	     
	     //Pagefactory
	     
	     RanfordHP RHP=PageFactory.initElements(driver,RanfordHP.class);
	     RHP.Login();
	     
	     Thread.sleep(3000);
	}
     
     
	     //Role
	 @Test()
     public void Rolecre() throws InterruptedException, IOException 
     {
     
		 FileInputStream FIS=new FileInputStream("D:\\EvngPrjMarch\\Ebanking\\src\\com\\ebanking\\testdata\\Role.xlsx");
			
		    // WorkBook
			
			XSSFWorkbook WB=new XSSFWorkbook(FIS);
			
			//Sheets
			
			XSSFSheet WS=WB.getSheet("Rdata");
			
			//Row Count
			
			int Rcount=WS.getLastRowNum();
			System.out.println(Rcount);
			
			// multiple Iterations ------------- Loop
			
			for (int i=1; i<=Rcount;i++)
			{
				//Row
				
				XSSFRow WR=WS.getRow(i);
				
				//cells
				
				XSSFCell WC=WR.getCell(0);
				XSSFCell WC1=WR.getCell(1);
				
				XSSFCell WC2=WR.createCell(2);
				
				//Cell Values
				
				String Rname=WC.getStringCellValue();
				String Rty=WC1.getStringCellValue();
			
	     AdminHp AHP=PageFactory.initElements(driver,AdminHp.class);
	     AHP.Rol();
	     
	     Thread.sleep(3000);
	     
	     //New Role
	     
	     Roledetails RD=PageFactory.initElements(driver,Roledetails.class);
	     RD.Nrole();
	     
	     Thread.sleep(3000);
	     //Role Creation
	     
	     RoleCreation RC=PageFactory.initElements(driver,RoleCreation.class);
	     RC.Rcreation(Rname,Rty);
	     Thread.sleep(3000);
	     //Alert
	     
	     driver.switchTo().alert().accept();
	     Thread.sleep(3000);
	     //Role Home
	     
	     RD.Rhom();
	     Thread.sleep(3000);
	
			}
     }    
	
	    
	 
	 
	 
	}

