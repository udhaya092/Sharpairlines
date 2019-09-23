package org.hap;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\udhaya\\Documents\\Test\\driver\\chromedrive.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.sharpairlines.com.au/");
		d.manage().window().maximize();
		WebElement from = d.findElement(By.xpath("//select[@name='departure']"));
		Select s=new Select(from);
		boolean n=s.isMultiple();
		System.out.println(n);
		List<WebElement> f=s.getOptions();
		s.selectByIndex(1);
		WebElement dest=d.findElement(By.name("destination"));
		Select s1=new Select(dest);
		List<WebElement> de=s1.getOptions();
		s1.selectByIndex(2);
		WebElement depdate=d.findElement(By.name("departuredate"));
		depdate.sendKeys("12Oct2019");
		Thread.sleep(5000);
		WebElement login=d.findElement(By.xpath("(//input[@type='submit'])[1]"));
		login.click();
		
		
		Thread.sleep(20000);
		WebElement withoutlogin=d.findElement(By.id("btnContinue"));
		withoutlogin.click();
		WebElement firstname=d.findElement(By.id("FirstName1"));
		firstname.sendKeys("udhayakumar");
		WebElement lastname = d.findElement(By.id("FamilyName1"));
		lastname.sendKeys("m");
		WebElement mob = d.findElement(By.id("ContactMobileNumber"));
		mob.sendKeys("9999999999");
		WebElement mail = d.findElement(By.id("EmailAddress"));
		mail.sendKeys("12345@gmail.com");
		WebElement card = d.findElement(By.id("ucxCreditCardDetails_CreditCardType"));
		Select s2=new Select(card);
		List<WebElement> c=s2.getOptions();
		s2.selectByIndex(3);
		WebElement cardnumber = d.findElement(By.id("ucxCreditCardDetails_CreditCardNumber"));
		cardnumber.sendKeys("12345678");
		WebElement expdate = d.findElement(By.id("ucxCreditCardDetails_CreditCardExpiryMonth"));
		Select s3=new Select(expdate);
		List<WebElement> exp=s3.getOptions();
		s3.selectByIndex(6);
		WebElement expyear = d.findElement(By.id("ucxCreditCardDetails_CreditCardExpiryYear"));
		Select s4=new Select(expyear);
		List<WebElement> expy=s4.getOptions();
		s4.selectByIndex(5);
		WebElement holdername=d.findElement(By.id("ucxCreditCardDetails_CardHolderName"));
		holdername.sendKeys("udhayakumar");
		WebElement sec=d.findElement(By.id("ucxCreditCardDetails_SecurityCVVCode"));
		sec.sendKeys("1234");
		WebElement check=d.findElement(By.id("chkAccept"));
		check.click();
	}

}
